package com.jydacai.DLMServer.data.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jydacai.DLMServer.data.dao.AccessMapper;
import com.jydacai.DLMServer.data.model.Access;


@Service
public class AccessService {
	private static final Logger LOG= LoggerFactory.getLogger(AccessService.class);
	
	@Autowired
	private AccessMapper accessMapper;
	
	public boolean insertAccessRecord(Access record) {
		try {
			accessMapper.insertSelective(record);
			return true;
		}catch(Exception ex) {
			LOG.error(ex.getMessage());
			return false;
		}
	}
}
