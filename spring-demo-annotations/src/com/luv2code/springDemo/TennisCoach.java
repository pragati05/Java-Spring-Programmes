package com.luv2code.springDemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*<bean id="tennisCoach" class="com.luv2code.springDemo.TennisCoach">
</bean>*/
@Component
@Scope("singleton")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	public TennisCoach(){
		System.out.println(">> TennisCoach: inside Default Contructor");
	}
	
	/* <constructor-arg ref="myFortune"></constructor-arg> */
	
	/*public TennisCoach(FortuneService fortuneService) {
		super();
		System.out.println(">> TennisCoach: Parameterized Contructor");
		this.fortuneService = fortuneService;
	}*/

	
	public FortuneService getFortuneService() {
		return fortuneService;
	}

	/*@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">> TennisCoach: Inside setFortuneService() ");
		this.fortuneService = fortuneService;
	}*/


	@Override
	public String getDailyWorkout() {
		return "Daily Tennius Practice ";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	
	@PostConstruct
	public void doStartupStuff(){
		System.out.println("doStartupStuff");
	}
	
	@PreDestroy
	public void doCleanUpStuff(){
		System.out.println("doCleanUpStuff");
	}
}
