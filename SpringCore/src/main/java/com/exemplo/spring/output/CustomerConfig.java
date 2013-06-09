package com.exemplo.spring.output;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.exemplo.spring.beans.CustomerBo;

@Configuration
public class CustomerConfig {
	@Bean(name = "customer")
	public CustomerBo costumerBo() {
		return new CustomerBo();
	}
}