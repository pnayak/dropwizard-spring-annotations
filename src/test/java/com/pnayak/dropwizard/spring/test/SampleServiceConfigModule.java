package com.pnayak.dropwizard.spring.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pnayak.dropwizard.common.resources.CommonResource;
import com.pnayak.dropwizard.spring.test.health.MyHealthCheck;
import com.pnayak.dropwizard.spring.test.resources.MyResource;
import com.pnayak.dropwizard.spring.test.service.MyOtherService;
import com.pnayak.dropwizard.spring.test.service.MyService;
import com.pnayak.dropwizard.spring.test.tasks.MyTask;

@Configuration
public class SampleServiceConfigModule {
	
	@Bean
	public MyOtherService myOtherService() {
		return new MyOtherService();
	}
	
	@Bean
	public MyService myService() {
		return new MyService(myOtherService());
	}
}
