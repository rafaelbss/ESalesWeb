package cloud.codeworks.esales.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import cloud.codeworks.esales.business.service.BaseService;

@Configuration
@ComponentScan(basePackageClasses=BaseService.class)
public class ServiceConfig {

}
