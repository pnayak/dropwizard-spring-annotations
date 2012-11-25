package com.pnayak.dropwizard.spring.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pnayak.dropwizard.spring.AutoWiredService;

public class SampleService extends AutoWiredService<SampleServiceConfiguration> {

	public SampleService() {
		super("sample-service", "com.pnayak.dropwizard.spring.test");
	}

	@Override
	protected AnnotationConfigApplicationContext createSpringApplicationContext() {
		return new AnnotationConfigApplicationContext(SampleServiceConfigModule.class);
	}
}
