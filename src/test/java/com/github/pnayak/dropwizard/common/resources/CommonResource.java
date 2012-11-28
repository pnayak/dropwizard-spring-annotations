package com.github.pnayak.dropwizard.common.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.github.pnayak.dropwizard.spring.test.service.MyService;

@Path("common-resource")
public class CommonResource {

	private MyService myService;
	
	@Autowired
	public CommonResource(MyService myService) {
		this.myService = myService;
	}
	
	@GET
	public Response doGet(){
		return Response.ok("We have so much in common!!!").build();
	}
	
	public MyService getMyService() {
		return myService;
	}
	
}

