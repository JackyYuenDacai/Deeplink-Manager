package com.jydacai.DLMServer;

import javax.annotation.PostConstruct;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@MapperScan(value = "com.jydacai.DLMServer.data.dao")
@ServletComponentScan(basePackages = "com.jydacai.DLMServer.filter")
@SpringBootApplication
public class DlmServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DlmServerApplication.class, args);
	}
	@PostConstruct
	public void init() {
		
	}

}