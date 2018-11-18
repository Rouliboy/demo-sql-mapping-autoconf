package com.example.demosql;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.ConfigurableEnvironment;
import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class AfterReady {

  private static final String SPRING_JPA_MAPPING_RESOURCES = "spring.jpa.mapping-resources";

  @Value("${test.jvi:BAD}")
  private String jvi;

  @Value("${spring.jpa.mapping-resources:BAD}")
  private String mapping;

  @Autowired
  private ConfigurableEnvironment env;

  @PostConstruct
  public void init() {
    log.info("JVI = " + jvi);
    log.info("mapping = " + mapping);
    //
    // for (final PropertySource<?> source : env.getPropertySources()) {
    // log.info("source name =" + source.getName());
    // log.info("source[SPRING_JPA_MAPPING_RESOURCES}="
    // + source.getProperty(SPRING_JPA_MAPPING_RESOURCES));
    // log.info("source=" + source.getSource());
    // }

  }
}
