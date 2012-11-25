package com.pnayak.dropwizard.spring.test.health;

import org.springframework.stereotype.Component;

import com.yammer.metrics.core.HealthCheck;

public class MyHealthCheck extends HealthCheck {

	public MyHealthCheck() {
		super("my-health");
	}
	
	@Override
	protected Result check() throws Exception {
		return Result.healthy();
	}

}
