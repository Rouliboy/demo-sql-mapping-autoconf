package com.nexity.wgl.lib.utils.jpa.mappings;

import java.util.Properties;
import java.util.Set;
import org.reflections.Reflections;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.boot.env.RandomValuePropertySource;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.PropertiesPropertySource;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class JpaMappingsEnvironmentListener
    implements ApplicationListener<ApplicationPreparedEvent> {

  private static final String SPRING_JPA_MAPPING_RESOURCES = "spring.jpa.mapping-resources";

  @Override
  public void onApplicationEvent(final ApplicationPreparedEvent event) {

    if (isJpaMappingsScanEnabled(event)) {
      if (applyJpaMappingsProperty(event)) {
        log.info(" **** CAN OVERRIDE **** ");

        final Properties properties = new Properties();
        properties.put(SPRING_JPA_MAPPING_RESOURCES, "TODO");
        event.getApplicationContext().getEnvironment().getPropertySources().addAfter(
            RandomValuePropertySource.RANDOM_PROPERTY_SOURCE_NAME,
            new PropertiesPropertySource("custom", properties));
      } else {
        log.warn(" **** CAN NOT OVERRIDE **** ");
      }
    } else {
      log.info(" **** SCAN NOT ENABLED **** ");
    }

  }

  private boolean isJpaMappingsScanEnabled(final ApplicationPreparedEvent event) {

    final Set<Class<?>> mainClasses =
        new Reflections("com.nexity").getTypesAnnotatedWith(SpringBootApplication.class);

    if (1 == mainClasses.size()) {
      final Class<?> mainClass = mainClasses.iterator().next();
      return null != mainClass.getAnnotation(EnableJpaMappingsScan.class);
    }
    return false;
  }

  private boolean applyJpaMappingsProperty(final ApplicationPreparedEvent event) {

    return null == event.getApplicationContext().getEnvironment()
        .getProperty(SPRING_JPA_MAPPING_RESOURCES);

  }

}
