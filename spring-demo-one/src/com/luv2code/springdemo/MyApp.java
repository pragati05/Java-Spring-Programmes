package com.luv2code.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// Create Object
		HappyFortuneService service = new HappyFortuneService();
		Coach theCoach = new TrackCoach(service);

		// Use Object
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());

	}

}
