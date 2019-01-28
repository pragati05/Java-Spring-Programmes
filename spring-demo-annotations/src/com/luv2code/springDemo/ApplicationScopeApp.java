package com.luv2code.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationScopeApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		System.out.println("poining to same object: " + (theCoach == alphaCoach));
		System.out.println("Memory Location: theCoach: " + theCoach);
		System.out.println("Memory Location : alphaCoach" + alphaCoach);
		context.close();
	}

}
