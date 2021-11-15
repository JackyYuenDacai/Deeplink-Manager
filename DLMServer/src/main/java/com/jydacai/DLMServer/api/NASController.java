package com.jydacai.DLMServer.api;

import java.net.InetAddress;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.jydacai.DLMServer.data.model.Access;
import com.jydacai.DLMServer.data.model.Deeplink;
import com.jydacai.DLMServer.data.model.NAS;
import com.jydacai.DLMServer.data.service.AccessService;
import com.jydacai.DLMServer.data.service.DeeplinkService;
import com.jydacai.DLMServer.data.service.NASService;
import com.jydacai.DLMServer.utils.AccessFilter;
import com.jydacai.DLMServer.utils.ifconfig;
import com.jydacai.DLMServer.utils.ipconfig;


/*
  	time_index datetime,
	milli_mul int,
	milli_index int,
	avg_amp double,
	max_amp double,
	min_amp double
 */
@CrossOrigin
@Controller
@RequestMapping("/nas")
public class NASController {
	private static final Logger LOG= LoggerFactory.getLogger(NASController.class);
	@Autowired
	private NASService nasService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseBody
    public ModelAndView nasStore(@RequestParam(value = "time", required = true) String time_index,
    		@RequestParam(value = "milli_mul", required = true) int milli_mul,
    		@RequestParam(value = "milli_index", required = true) int milli_index,
    		@RequestParam(value = "avg_amp", required = false) double avg_amp,
    		@RequestParam(value = "max_amp", required = false) double max_amp,
    		@RequestParam(value = "min_amp", required = false) double min_amp
    		) throws Exception {
		NAS record = new NAS();
		record.setAvgAmp(avg_amp);
		record.setMaxAmp(max_amp);
		record.setMinAmp(min_amp);
		record.setMilliIndex(milli_index);
		record.setMilliMul(milli_mul);
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss a", Locale.ENGLISH);
		formatter.setTimeZone(TimeZone.getTimeZone("GMT"));
//https://localhost/nas?time=22-01-2015 10:15:55 AM&milli_mul=100&milli_index=0&avg_amp=0.2&max_amp=0.2&min_amp=0.1
		//"22-01-2015 10:15:55 AM"; 
		Date date = formatter.parse(time_index);
		
		record.setTimeIndex(date);
		nasService.insertRecord(record);
		return new ModelAndView("redirect: https://www.google.com");
	}
}
