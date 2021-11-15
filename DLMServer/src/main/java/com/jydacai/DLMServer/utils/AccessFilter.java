package com.jydacai.DLMServer.utils;

import java.util.List;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jydacai.DLMServer.api.FlashController;
import com.jydacai.DLMServer.data.model.Access;
import com.jydacai.DLMServer.data.model.Filter;
import com.jydacai.DLMServer.data.service.FilterService;

@Service
public class AccessFilter {
	
	private static final Logger LOG= LoggerFactory.getLogger(AccessFilter.class);
	@Autowired
	FilterService filterService;
	public boolean IsfilterAccess(Access access,JSONObject info) {
		List<Filter> obtainedFilters = filterService.getFilterByChannelAndDeeplink(access.getDeeplinkid(), access.getChannelid());
		LOG.info(info.toString());
		for(Filter ft:obtainedFilters) {

			boolean flag = false;
			if(ft.getFiltermusthave() && !info.has(ft.getFilterfield())) return true;
			
			switch(ft.getValuetype()) {
			case 0:
				flag = filterInteger(ft,info);
				break;
			case 1:
				flag = filterFloat(ft,info);
				break;
			case 2:
				flag = filterString(ft,info);
				break;
			}
			
			if(flag && !ft.getFilterinverse())return true;
			if(!flag && ft.getFilterinverse())return true;
			
		}
		return false;
	}
	
	boolean filterInteger(Filter filter,JSONObject info) {
		/* support filter type 
		 * 0 
		 * 1
		 * 2
		 * 3
		 * 4
		 */
		int fieldValue = 0;
		try{
			fieldValue = info.getInt(filter.getFilterfield());
		}catch(Exception ex){
			if(filter.getFiltermusthave())return true;
			fieldValue = 0;
		}

		switch(filter.getFiltertype()) {
		case 0:
			return false;
		case 1:
			if(fieldValue>=filter.getIvalue() && fieldValue <= filter.getExtivalue())return true;
			break;
		case 2:
			if(fieldValue==filter.getIvalue())return true;
			break;
		case 3:
			if(fieldValue<filter.getIvalue())return true;
			break;
		case 4:
			if(fieldValue<filter.getIvalue())return true;
			break;
		}
		return false;
	}
	boolean filterFloat(Filter filter,JSONObject info) {
		/* support filter type 
		 * 0 
		 * 1
		 * 2
		 * 3
		 * 4
		 */
		float fieldValue = .0f;
		try{
			fieldValue = info.getFloat(filter.getFilterfield());
		}catch(Exception ex){
			if(filter.getFiltermusthave())return true;
			fieldValue = .0f;
		}

		switch(filter.getFiltertype()) {
		case 0:
			return false;
		case 1:
			if(fieldValue>=filter.getDvalue() && fieldValue <= filter.getExtdvalue())return true;
			break;
		case 2:
			if(fieldValue==filter.getDvalue())return true;
			break;
		case 3:
			if(fieldValue<filter.getDvalue())return true;
			break;
		case 4:
			if(fieldValue<filter.getDvalue())return true;
			break;
		}
		return false;
	}
	boolean filterString(Filter filter,JSONObject info) {
		/* support filter type 
		 * 0 
		 * 2
		 * 5
		 */
		String fieldValue = "";
		try{
			fieldValue = info.getString(filter.getFilterfield());
		}catch(Exception ex){
			LOG.info(ex.getMessage());
			if(filter.getFiltermusthave())return true;
			fieldValue = "";
		}
		switch(filter.getFiltertype()) {
		case 0:
			return false;
		case 2:
			if(fieldValue.equals(filter.getValue()))return true;
			break;
		case 5:
			if(fieldValue.contains(filter.getValue()))return true;
			break;
		}
		return false;
	}
}

/*
filterField nvarchar(64),
filterType int unsigned, 
    
    filter type: 
        0-none,
        1-between,
        2-equal,
        3-less,
        4-more,
        5-contains 
    
filterInverse boolean, 
filterMustHave boolean,
valueType int unsigned, 
    
        0-int,
        1-float/double
        2-string
    
value nvarchar(256),
extValue nvarchar(256),

dvalue double,
extDValue double,

ivalue int,
extIValue int, */