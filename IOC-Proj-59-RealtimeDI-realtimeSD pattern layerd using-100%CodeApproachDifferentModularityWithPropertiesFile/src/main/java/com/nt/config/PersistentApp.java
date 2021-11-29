package com.nt.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages = "com.nt.dao")
@PropertySource(value = "com/nt/commons/jdbc.properties")
public class PersistentApp {
	@Autowired
	Environment env;
	
	@Value("${p.val}")
  String val;

	
	@Bean
	public DataSource getDataSourcee() {
		System.out.println(val);
		
		HikariDataSource ds=new HikariDataSource();
		  ds.setDriverClassName(env.getProperty("jdbc.driverClass"));
		  ds.setJdbcUrl(env.getProperty("jdbc.url"));
		  ds.setUsername(env.getProperty("jdbc.user"));
		  ds.setPassword(env.getProperty("jdbc.pwd"));
		  return ds;
		
	}

}
