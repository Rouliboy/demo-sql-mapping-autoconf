package com.example.demosql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.nexity.wgl.lib.utils.jpa.mappings.EnableJpaMappingsScan;

@SpringBootApplication
@EnableJpaMappingsScan
public class DemoSqlApplication {

  public static void main(final String[] args) {
    SpringApplication.run(DemoSqlApplication.class, args);

  }
}
