package com.jydacai.DLMServer.data.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jydacai.DLMServer.data.dao.DeeplinkMapper;
import com.jydacai.DLMServer.data.model.Deeplink;
import com.jydacai.DLMServer.data.model.DeeplinkExample;

@Service
public class DeeplinkService {
	
	private static final Logger LOG= LoggerFactory.getLogger(DeeplinkService.class);
	
	@Autowired
	private DeeplinkMapper deeplinkMapper;
	
	public Deeplink getByCode(String code) {
		Deeplink ret = null;
		DeeplinkExample deeplinkExample = new DeeplinkExample();
		deeplinkExample.createCriteria().andCodeEqualTo(code);
		try {
			ret = deeplinkMapper.selectByExample(deeplinkExample).get(0);
		}catch(Exception ex) {
			LOG.error(ex.getMessage());
		}
		return ret;
	}
}
