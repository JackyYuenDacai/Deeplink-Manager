package com.jydacai.DLMServer.proc;

import java.text.ParseException;
import java.util.List;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.scheduling.quartz.QuartzJobBean;

import com.jydacai.DLMServer.api.FlashController;



public class TimerEvent extends QuartzJobBean{
	//@Autowired
	//private usersService UsersService;
	private static final Logger LOG= LoggerFactory.getLogger(TimerEvent.class);
    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
    	//LOG.info("TICK");
    } 
}
