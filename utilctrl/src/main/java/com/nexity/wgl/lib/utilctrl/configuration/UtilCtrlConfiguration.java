package com.nexity.wgl.lib.utilctrl.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.nexity.wgl.lib.utilctrl")
@EntityScan("com.nexity.wgl.lib.utilctrl")
@PropertySource("classpath:com/nexity/wgl/lib/utilctrl/utilctrl.properties")
public class UtilCtrlConfiguration {

}
