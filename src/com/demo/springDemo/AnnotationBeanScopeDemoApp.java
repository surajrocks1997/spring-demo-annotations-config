package com.demo.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		boolean result = (theCoach == alphaCoach);
		System.out.println("Pointing to the same Object: " + result);
		
		System.out.println("Memory location for the theCoach: " + theCoach);
		System.out.println("Memory location for the alphaCoach: " + alphaCoach);
		
		context.close();
		
	}
}
