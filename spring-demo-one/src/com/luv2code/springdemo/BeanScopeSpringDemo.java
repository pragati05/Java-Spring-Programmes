package com.luv2code.springdemo;

import java.awt.AlphaComposite;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeSpringDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach aplhaCoach = context.getBean("myCoach", Coach.class);

		boolean result = (theCoach == aplhaCoach);
		System.out.println("Are objects pointing to the same refrence: " + result);
		System.out.println("theCoach: " + theCoach);
		System.out.println("alphaCoach: " + aplhaCoach);
	}

}
