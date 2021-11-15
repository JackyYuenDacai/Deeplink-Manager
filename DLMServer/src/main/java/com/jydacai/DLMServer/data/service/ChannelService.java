package com.jydacai.DLMServer.data.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jydacai.DLMServer.data.dao.ChannelMapper;

@Service
public class ChannelService {
	private static final Logger LOG= LoggerFactory.getLogger(ChannelService.class);
	
	@Autowired
	private ChannelMapper channelMapper;
}
