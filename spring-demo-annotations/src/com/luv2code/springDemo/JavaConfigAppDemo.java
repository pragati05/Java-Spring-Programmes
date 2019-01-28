package com.luv2code.springDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigAppDemo {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		System.out.println("poining to same object: " + (theCoach == alphaCoach));
		System.out.println("Memory Location: theCoach: " + theCoach);
		System.out.println("Memory Location : alphaCoach" + alphaCoach);
		context.close();
	}

}
