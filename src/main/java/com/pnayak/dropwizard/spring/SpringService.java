package com.pnayak.dropwizard.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Configuration;
import com.yammer.dropwizard.config.Environment;

public abstract class SpringService<T extends Configuration> extends Service<T> {
	
	protected AnnotationConfigApplicationContext appContext;

	protected SpringService(String name) {
		super(name);
		this.appContext = createSpringApplicationContext();
	}
	
	protected AnnotationConfigApplicationContext createSpringApplicationContext() {
		return new AnnotationConfigApplicationContext();
	}

	protected void initialize(T configuration, Environment environment)
			throws Exception {
		initializeWithAppContext(configuration, environment, appContext);
	}

	protected abstract void initializeWithAppContext(T configuration,
			Environment environment, AnnotationConfigApplicationContext appContext)
			throws Exception;

}
