package com.demo.springDemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] data = {
		"fortune1", "fortune2", "fortune3"	
	};
	
	private Random random = new Random();
	
	@Override
	public String getFortune() {
		int index = random.nextInt(data.length);
		String theFortune = data[index];
		return theFortune;
	}

}
