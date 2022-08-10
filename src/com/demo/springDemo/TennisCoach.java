package com.demo.springDemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println("TennisCoach: inside default constructor");
	}
	
	@PostConstruct
	public void doMyStartUpStuff() {
		System.out.println("Inside: doMyStartUpStuff()");
	}
	
	@PreDestroy
	public void doMyCleanUpStuff() {
		System.out.println("Inside: doMyCleanUpStuff()");
	}

//	@Autowired
//	public void doCrazyStuff(FortuneService fortuneService) {
//		System.out.println("TennisCoach: inside doCrazyStuff() method");
//		this.fortuneService = fortuneService;
//	}

//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		super();
//		System.out.println("TennisCoach: inside parameterized constructor");
//		this.fortuneService = fortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		return "Practice your backend smash";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
