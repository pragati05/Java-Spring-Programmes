package com.luv2code.springdemo;

public class GulfCoach implements Coach {

	private FortuneService theFortuneSerive;
	
	public GulfCoach(FortuneService theFortuneSerive) {
		super();
		this.theFortuneSerive = theFortuneSerive;
	}

	@Override
	public String getDailyWorkout() {
		return "Daily Gulf Practice";
	}
	
	@Override
	public String getDailyFortune() {
		return theFortuneSerive.getFortune();
	}
	// init method
	public void doInitStuff() {
		System.out.println("GulfCoach: doInitStuff");
	}

	// Destroy Method
	public void doCleanStuff() {
		System.out.println("GulfCoach: doCleanStuff");
	}

	
}
