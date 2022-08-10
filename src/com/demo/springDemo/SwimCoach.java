package com.demo.springDemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;

	public SwimCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim 1k meters as Warm Up";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

}
