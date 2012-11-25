package com.pnayak.dropwizard.spring.test;

import org.codehaus.jackson.annotate.JsonProperty;

import com.yammer.dropwizard.config.Configuration;

public class SampleServiceConfiguration extends Configuration {

	@JsonProperty
	private String foo;
	
	public String getFoo() {
		return foo;
	}
	
	public String getBar() {
		return "bar";
	}
}
