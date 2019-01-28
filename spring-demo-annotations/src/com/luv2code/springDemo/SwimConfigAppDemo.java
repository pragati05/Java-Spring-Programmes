package com.luv2code.springDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimConfigAppDemo {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		SwimCoach swimCoach = context.getBean(SwimCoach.class);
		
		System.out.println("Swim Fortune: " + swimCoach.getDailyFortune());
		System.out.println("Swim Workout: " + swimCoach.getDailyWorkout());
		System.out.println("Email: " + swimCoach.getEmail());
		System.out.println("Team: " + swimCoach.getTeam());
		context.close();
	}

}
