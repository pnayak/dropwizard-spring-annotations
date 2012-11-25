Dropwizard-Spring
=================

This project provides support for integrating Spring with Dropwizard. It was inspired and originally cloned+mirrored from https://github.com/jaredstehler/dropwizard-guice. It uses classpath scanning courtesy of the Reflections project to discover resources to install into the dropwizard environment upon service start.

### Usage

Extend from AutoWiredService<? extends Configuration> rather than Service.  In addition, any Dropwizard Resources, Tasks, HealthChecks and Managed objects also need to be annotated with Spring's @Component annotation. Optionally override createSpringApplicationContext() to provide any of the same Dropwizard objects that require any complicated initializations. Once this is done, all of these DropWizard objects will be able to use Spring's @Autowired annotations for dependency injection! A good use case for this might be to use Spring-Data within your DropWizard objects.

See the test classes located within src/test/java/com/pnayak/dropwizard/spring/test for an example.

TODO: I expect to make this library available soon on the public maven repository:

    <dependency>
        <groupId>com.pnayak.dropwizard.spring</groupId>
        <artifactId>dropwizard-spring</artifactId>
        <version>0.1.0-SNAPSHOT</version>
    </dependency>
    
