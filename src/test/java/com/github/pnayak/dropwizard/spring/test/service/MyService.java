package com.github.pnayak.dropwizard.spring.test.service;

import org.springframework.beans.factory.annotation.Autowired;

public class MyService {

	private MyOtherService myOtherService;
	
	@Autowired
	public MyService(MyOtherService myOtherService) {
		this.myOtherService = myOtherService;
	}
	
	public MyOtherService getMyOtherService() {
		return myOtherService;
	}
	
}
