package com.luv2code.springDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.luv2code.springDemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {

	@Bean
	public FortuneService crazyFortuneService(){
		return new CrazyFortuneService();
	}
	
	@Bean
	public Coach swimCoach(){
		return new SwimCoach(crazyFortuneService());
	}
	

}
