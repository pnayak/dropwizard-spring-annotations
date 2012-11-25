package com.pnayak.dropwizard.spring.test;

import com.pnayak.dropwizard.spring.AutoWiredService;

/**
 * A test service that uses the varargs constructor for AutoConfigService
 * @author ggavares
 *
 */
public class MultiPackageService extends AutoWiredService<SampleServiceConfiguration> {
  
  public MultiPackageService() {
    super("sample-service", "com.pnayak.dropwizard.spring.test", "com.pnayak.dropwizard.common.resources");
  }
}
