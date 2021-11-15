package com.jydacai.DLMServer.api;

import java.net.InetAddress;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.ognl.ASTThisVarRef;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.jydacai.DLMServer.data.model.Access;
import com.jydacai.DLMServer.data.model.Deeplink;
import com.jydacai.DLMServer.data.service.AccessService;
import com.jydacai.DLMServer.data.service.DeeplinkService;
import com.jydacai.DLMServer.utils.AccessFilter;
import com.jydacai.DLMServer.utils.ifconfig;
import com.jydacai.DLMServer.utils.ipconfig;

@CrossOrigin
@Controller
@RequestMapping("/flash")
public class FlashController {
	private static final Logger LOG = LoggerFactory.getLogger(FlashController.class);

	@Autowired
	DeeplinkService deeplinkService;
	@Autowired
	AccessService accessService;
	@Autowired
	AccessFilter accessFilter;

	private Object getValue(JSONObject jobj, String key) {
		return jobj.has(key) ? jobj.get(key) : null;
	}

	@SuppressWarnings("deprecation")
	@RequestMapping(value = "/go/{code0}", method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView goPort(HttpServletRequest request, @PathVariable("code0") String requestCode) throws Exception {
		// requestCode = URLEncoder.encode(requestCode,"UTF-8");
		ModelAndView mav = new ModelAndView();
		Deeplink dlink = deeplinkService.getByCode(requestCode);
		Map<String, String[]> params = request.getParameterMap();
		String ipAddr = null;
		if (request.getHeader("CF-Connecting-IP") != null && request.getHeader("CF-Connecting-IP").isEmpty() == false)
			ipAddr = request.getHeader("CF-Connecting-IP");
		else
			ipAddr = request.getRemoteAddr();
		if (dlink == null) {
			LOG.info(requestCode + "->" + "NOT FOUND");
			mav.setViewName("error");
			mav.setStatus(HttpStatus.NOT_FOUND);
			mav.addObject("type", "error");
			return mav;
		} else {
			JSONObject ipinfo = ifconfig.getIpConfig(ipAddr);

			Access access = new Access();
			InetAddress ip = InetAddress.getByName(ipAddr);
			byte[] bytes = ip.getAddress();

			java.util.Date date = new java.util.Date();

			access.setIp(bytes);
			access.setIpaddr(ipAddr);
			ipinfo.put("referer", request.getHeader("referer"));
			ipinfo.put("user-agent", request.getHeader("User-Agent"));
			ipinfo.put("ipAddr", ipAddr);
			ipinfo.put("host", request.getRemoteHost());
			access.setExtrainfo(ipinfo.toString());

			access.setDeeplinkid(dlink.getId());
			access.setChannelid(dlink.getChannelid());
			access.setAccessdate(date);
			access.setAccesstime(date);
			access.setAccesstimezone(date.getTimezoneOffset());
			access.setDenied(accessFilter.IsfilterAccess(access, ipinfo));
			accessService.insertAccessRecord(access);
			if (!access.getDenied()) {
				LOG.info(requestCode + "->" + dlink.getTarget());
				String paramList = "?";
				if (request.getParameterNames().hasMoreElements()) {
					for (String paramKeys : Collections.list(request.getParameterNames())) {
						// Whatever you want to do with your map
						// Key : params
						// Value : httpServletRequest.getParameter(params)
						paramList += paramKeys + "=" + request.getParameter(paramKeys) + "&";
					}
					if (dlink.getTarget().contains("filmcolor.xyz")) {
						paramList += "app=true";
					}
					return new ModelAndView("redirect:" + dlink.getTarget() + paramList);
				} else {
					return new ModelAndView("redirect:" + dlink.getTarget());
				}
			} else {

				if (dlink.getDeniedtarget() != null && !dlink.getDeniedtarget().isEmpty()) {
					LOG.info(requestCode + "->DENIED->" + dlink.getDeniedtarget());
					return new ModelAndView("redirect:" + dlink.getDeniedtarget());
				} else {
					LOG.info(requestCode + "->" + "DENIED");
					mav.setViewName("error");
					mav.setStatus(HttpStatus.NOT_FOUND);
					mav.addObject("type", "error");
					return mav;
				}
			}
		}
	}
}
