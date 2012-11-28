package com.github.pnayak.dropwizard.spring.test.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.github.pnayak.dropwizard.spring.test.SampleServiceConfiguration;
import com.github.pnayak.dropwizard.spring.test.service.MyService;

@Component
@Path("my-resource")
public class MyResource {

	private MyService myService;
	private SampleServiceConfiguration configuration;
	
	@Autowired
	public MyResource(MyService myService, SampleServiceConfiguration configuration) {
		this.myService = myService;
		this.configuration = configuration;
	}
	
	@GET
	public Response doGet(){
		return Response.ok("hello world!").build();
	}
	
	public MyService getMyService() {
		return myService;
	}
	
	public SampleServiceConfiguration getConfiguration() {
		return configuration;
	}
}
