package com.nt.config;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SimpleBeanConfig {
	
	@Bean
	public LocalTime createTime() {
		return LocalTime.now();
	}

}
