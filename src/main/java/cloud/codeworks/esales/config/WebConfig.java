package cloud.codeworks.esales.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import cloud.codeworks.esales.controller.BaseController;

@Configuration
@ComponentScan(basePackageClasses={ BaseController.class })
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {

}
