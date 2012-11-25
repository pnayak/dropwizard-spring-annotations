package com.pnayak.dropwizard.spring.test.health;

import org.springframework.beans.factory.annotation.Autowired;

import com.pnayak.dropwizard.spring.test.service.MyService;
import com.yammer.metrics.core.HealthCheck;

public class MyHealthCheck extends HealthCheck {
	
	@Autowired
	private MyService myService;

	public MyHealthCheck() {
		super("my-health");
	}
	
	@Override
	protected Result check() throws Exception {
		return Result.healthy();
	}
	
	public MyService getMyService() {
		return myService;
	}

}
