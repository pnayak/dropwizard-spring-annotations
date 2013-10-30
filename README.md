Dropwizard with Spring Annotations
==================================

This project provides support for integrating Spring with Dropwizard using annotations (i.e. no Spring XML configuration required). As of now, it supports Dropwizard 0.6+.

It was inspired and originally cloned+mirrored from Jared Stehler's dropwizard-guice library - https://github.com/jaredstehler/dropwizard-guice. Like dropwizard-guice, it uses classpath scanning courtesy of the Reflections project to discover Dropwizard objects (Resources, HealthChecks, Tasks and Managed) to install into the Dropwizard environment upon service start.

### Usage

Following the first two steps below is all you need to do to get this working.

* Extend from AutoWiredService<? extends Configuration> rather than Service  
* In addition, annotate Dropwizard Resources, Tasks, HealthChecks and Managed with Spring's @Component annotation
* Optionally, override createSpringApplicationContext() in your service class to provide custom initializations for any of your Dropwizard objects 

The nice benefit of doing this is that your DropWizard objects will be able to use Spring's @Autowired annotations for dependency injection.  You can provide any number of configuration classes annotated with Spring's @Configuration annotation in your application.  

In addition, the library also registers the Dropwizard configuration object into Spring's bean registry.  This allows you to auto-wire your Dropwizard configuration into any of your Dropwizard objects.  

For e.g.
```java
@Component
@Path("my-resource")
public class MyResource {

    private SampleServiceConfiguration configuration;

    @Autowired
    public MyResource(SampleServiceConfiguration configuration) {
        this.configuration = configuration;
    }
...
}
```
A good use case for this library might be to use Spring-Data within your DropWizard objects.

See the test classes located within src/test/java/com/github/pnayak/dropwizard/spring/test for an example.

To use in your Maven projects:

    <dependency>
        <groupId>com.github.pnayak</groupId>
        <artifactId>dropwizard-spring-annotations</artifactId>
        <version>1.0.0</version>
    </dependency>
    
