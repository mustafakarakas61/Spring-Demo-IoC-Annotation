package com.springdemo.config;

import com.springdemo.controller.CustomerManager;
import com.springdemo.service.ICustomerDal;
import com.springdemo.service.ICustomerService;
import com.springdemo.dao.MySqlCustomerDal;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.springdemo")
@PropertySource("classpath:values.properties")

public class IocConfig {
	@Bean
	public ICustomerDal database(){
		return new MySqlCustomerDal();
		
	}
	@Bean
	public ICustomerService service() {
		return new CustomerManager(database());
	}
}
