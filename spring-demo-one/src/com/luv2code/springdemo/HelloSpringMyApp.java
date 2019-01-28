package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringMyApp {

	public static void main(String[] args) {

		// Create Object
		// Coach theCoach = new TrackCoach();
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach = context.getBean("myCoach", Coach.class);
		CricketCoach theCricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		// Use Object
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println("****************************");
		System.out.println(theCricketCoach.getDailyWorkout());
		System.out.println(theCricketCoach.getDailyFortune());
		System.out.println(theCricketCoach.getEmail());
		System.out.println(theCricketCoach.getTeam());
		
		

	}

}
