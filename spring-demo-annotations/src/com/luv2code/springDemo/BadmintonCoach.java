package com.luv2code.springDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


/*<bean id="thatBadmintonCoach" class="com.luv2code.springDemo.BadmintonCoach">
</bean>*/
@Component("thatBadmintonCoach")
public class BadmintonCoach implements Coach {

	@Autowired
	@Qualifier("happyFoutuneService")
	private FortuneService fortuneService;
	
	public BadmintonCoach(){
		System.out.println(">> BadmintonCoach: Inside Default Contrustor");
	}
	
	/* <constructor-arg ref="myFortune"></constructor-arg> */
	/*@Autowired
	public BadmintonCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}*/

	@Override
	public String getDailyWorkout() {
		return "Daily Badminton Practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
