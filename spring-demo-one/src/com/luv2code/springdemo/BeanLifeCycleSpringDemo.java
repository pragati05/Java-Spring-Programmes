package com.luv2code.springdemo;

import java.awt.AlphaComposite;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleSpringDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach aplhaCoach = context.getBean("myCoach", Coach.class);
		context.close();
	
	}

}
