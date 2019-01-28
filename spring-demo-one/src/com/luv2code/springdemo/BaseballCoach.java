package com.luv2code.springdemo;

public class BaseballCoach implements Coach {

	FortuneService fortuneService;

	BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "Spend 30 mins on batting";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
