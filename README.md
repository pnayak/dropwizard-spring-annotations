Dropwizard-Spring
=================

This project provides support for integrating Spring with Dropwizard. It was inspired and originally cloned+mirrored from Jared Stehler's dropwizard-guice library - https://github.com/jaredstehler/dropwizard-guice. Like dropwizard-guice, it uses classpath scanning courtesy of the Reflections project to discover Dropwizard objects (Resources, HealthChecks, Tasks and Managed) to install into the Dropwizard environment upon service start.

### Usage

Extend from AutoWiredService<? extends Configuration> rather than Service.  In addition, any Dropwizard Resources, Tasks, HealthChecks and Managed objects also need to be annotated with Spring's @Component annotation. Optionally override createSpringApplicationContext() in your service to provide any of the same Dropwizard objects that require any complicated initializations. Once this is done, all of these DropWizard objects will be able to use Spring's @Autowired annotations for dependency injection! This includes the ability to auto-wire your Dropwizard configuration into any of your Dropwizard objects.  For e.g.
```java
@Component
@Path("my-resource")
public class MyResource {

@Autowired
private SampleServiceConfiguration configuration;

...
}
```
A good use case for this library might be to use Spring-Data within your DropWizard objects.

See the test classes located within src/test/java/com/pnayak/dropwizard/spring/test for an example.

TODO: I expect to make this library available soon on the public maven repository:

    <dependency>
        <groupId>com.pnayak.dropwizard.spring</groupId>
        <artifactId>dropwizard-spring</artifactId>
        <version>0.5.0</version>
    </dependency>
    
