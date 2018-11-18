package com.nexity.wgl.lib.utils.jpa.mappings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableJpaMappingsScan
public class MyApp {
  public static void main(final String[] args) {
    SpringApplication.run(MyApp.class, args);

  }
}
