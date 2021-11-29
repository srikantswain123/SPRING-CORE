package com.nt.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.nt.beans")
public class AppConfig {
	static {
		System.out.println("AppConfig.static()");
	}
	
	
	public AppConfig() {
		System.out.println("AppConfig::zero param constructor");
	}


	@Bean(name="dt")
	public LocalDateTime sysCreateDate() {
		System.out.println("AppConfig.sysCreateDate()");
		return LocalDateTime.now();
	}

}
