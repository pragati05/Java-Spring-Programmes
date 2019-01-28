package com.luv2code.springDemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService FortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	public SwimCoach(com.luv2code.springDemo.FortuneService fortuneService) {
		super();
		FortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim 500mtr Daily !";
	}

	@Override
	public String getDailyFortune() {
		return FortuneService.getFortune();
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

}
