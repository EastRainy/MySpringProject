package com.spring.chap1.main;

import com.spring.chap1.service.GreetingMessageService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		GreetingMessageService gms = 
				context.getBean("greetingMessageServiceImpl", GreetingMessageService.class);
		
		System.out.println(gms.greetUser());
		
	}
	
	
}
