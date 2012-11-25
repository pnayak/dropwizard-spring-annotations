Dropwizard-Spring
=================

This project provides support for integrating Spring with Dropwizard. It was inspired and originally cloned+mirrored from https://github.com/jaredstehler/dropwizard-guice. It uses classpath scanning courtesy of the Reflections project to discover resources to install into the dropwizard environment upon service start.

### Usage

Extend from AutoWiredService<? extends Configuration> rather than Service, and optionally override createSpringApplicationContext() to provide Spring @Configureation classes. Now you'll be able to use Spring @Autowired annotations throughout your project for dependency injection!

See the test classes located within src/test/java/com/pnayak/dropwizard/spring/test for an example.

This library is available on the public maven repository:

    <dependency>
        <groupId>com.pnayak.dropwizard.spring</groupId>
        <artifactId>dropwizard-spring</artifactId>
        <version>0.1.0-SNAPSHOT</version>
    </dependency>
    
