package com.github.pnayak.dropwizard.spring.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.pnayak.dropwizard.common.resources.CommonResource;
import com.github.pnayak.dropwizard.spring.test.health.MyHealthCheck;
import com.github.pnayak.dropwizard.spring.test.resources.MyResource;
import com.github.pnayak.dropwizard.spring.test.service.MyOtherService;
import com.github.pnayak.dropwizard.spring.test.service.MyService;
import com.github.pnayak.dropwizard.spring.test.tasks.MyTask;

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
