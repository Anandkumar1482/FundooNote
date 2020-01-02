package com.bridgelabz.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bridgelabz.springboot.util.Utility;

@Configuration
public class ApplicationConfig {
@Bean
	public Utility getBean() {
	return new Utility();	
	}
}
