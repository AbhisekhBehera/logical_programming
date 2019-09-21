package com.nt.beans;

import java.util.Calendar;
import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages="com.nt.beans")
public class AppConfig {
	public AppConfig() {
		System.out.println("AppConfig:0-param constructor");
	}
	@Bean(name="cal")
	@Scope("singleton")
	
	public Date createDate() {
		System.out.println("AppConfig.createDate()");
	return new Date();	
	}

}
