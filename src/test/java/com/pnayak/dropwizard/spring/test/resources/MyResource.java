package com.pnayak.dropwizard.spring.test.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pnayak.dropwizard.spring.test.service.MyService;

@Component
@Path("my-resource")
public class MyResource {

	private MyService myService;
	
	@Autowired
	public MyResource(MyService myService) {
		this.myService = myService;
	}
	
	@GET
	public Response doGet(){
		return Response.ok("hello world!").build();
	}
	
	public MyService getMyService() {
		return myService;
	}
	
}
