package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	FortuneService fortuneService;

	TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run 5km";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
