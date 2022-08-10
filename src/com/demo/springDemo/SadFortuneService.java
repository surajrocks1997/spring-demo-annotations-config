package com.demo.springDemo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is kinda Low";
	}

}
