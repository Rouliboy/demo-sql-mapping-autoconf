package com.nexity.wgl.lib.utils.jpa.mappings.components;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(properties = {"spring.jpa.mapping-resources=TITI"})
public class EnableJpaMappingsScanTest {

  @Autowired
  private Environment env;

  @Test
  public void test() {

    // ClassPathScanningCandidateComponentProvider scanner =
    // new ClassPathScanningCandidateComponentProvider(<DO_YOU_WANT_TO_USE_DEFALT_FILTER>);
    //
    // scanner.addIncludeFilter(new AnnotationTypeFilter(<TYPE_YOUR_ANNOTATION_HERE>.class));
    //
    // for (BeanDefinition bd : scanner.findCandidateComponents(<TYPE_YOUR_BASE_PACKAGE_HERE>))
    // System.out.println(bd.getBeanClassName());

    //

    // final SpringApplicationBuilder uws =
    // new SpringApplicationBuilder(MyApp.class).properties("server.port=8081",
    // "server.contextPath=/UserService", "SOA.ControllerFactory.enforceProxyCreation=true");
    // uws.run();

    throw new RuntimeException(
        "spring.jpa.mapping-resources=" + env.getProperty("spring.jpa.mapping-resources"));
  }
}
