package com.jydacai.DLMServer.data.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jydacai.DLMServer.data.dao.FilterMapper;
import com.jydacai.DLMServer.data.dao.NASMapper;
import com.jydacai.DLMServer.data.model.Access;
import com.jydacai.DLMServer.data.model.Filter;
import com.jydacai.DLMServer.data.model.FilterExample;
import com.jydacai.DLMServer.data.model.NAS;


@Service
public class NASService {
	private static final Logger LOG= LoggerFactory.getLogger(FilterService.class);
	
	@Autowired
	private NASMapper nasMapper;
	
	public boolean insertRecord(NAS record) {
		try {
			nasMapper.insertSelective(record);
			return true;
		}catch(Exception ex) {
			LOG.error(ex.getMessage());
			return false;
		}
	}
}
