package com.jydacai.DLMServer.pages;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.jydacai.DLMServer.api.FlashController;
import com.jydacai.DLMServer.data.service.DeeplinkService;

@Controller
public class IndexController  {
	private static final Logger LOG= LoggerFactory.getLogger(IndexController.class);
	

	@RequestMapping("/")
	public String index() {
	    return "index";
	}

}
