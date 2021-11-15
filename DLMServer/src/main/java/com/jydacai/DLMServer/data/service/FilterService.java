package com.jydacai.DLMServer.data.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jydacai.DLMServer.data.dao.FilterMapper;
import com.jydacai.DLMServer.data.model.Filter;
import com.jydacai.DLMServer.data.model.FilterExample;


@Service
public class FilterService {
	private static final Logger LOG= LoggerFactory.getLogger(FilterService.class);
	
	@Autowired
	private FilterMapper filterMapper;
	
	public List<Filter> getFilterByChannelAndDeeplink(String dlId,String chId){
		FilterExample filterExample = new FilterExample();
		filterExample.createCriteria().andChannelidEqualTo(chId).andDeeplinkidEqualTo(dlId);
		return filterMapper.selectByExample(filterExample);
	}
	
	public List<Filter> getFilterByChannelOrDeeplink(String dlId,String chId){
		FilterExample filterExample = new FilterExample();
		filterExample.createCriteria().andChannelidEqualTo(chId);
		List<Filter> chList = filterMapper.selectByExample(filterExample);
		
		FilterExample filterDlEx = new FilterExample();
		filterDlEx.createCriteria().andDeeplinkidEqualTo(dlId);
		List<Filter> dlList = filterMapper.selectByExample(filterDlEx);
		
		List<Filter> ret = new ArrayList<Filter>();
		if(chList!=null)
		ret.addAll(chList);
		if(dlList!=null)
		ret.addAll(dlList);
		
		return ret;
	}
}
