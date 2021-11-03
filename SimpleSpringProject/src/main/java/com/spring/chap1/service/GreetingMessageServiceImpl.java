package com.spring.chap1.service;

import org.springframework.stereotype.Service;

import com.spring.chap1.service.GreetingMessageService;

@Service
public class GreetingMessageServiceImpl implements GreetingMessageService{
	
	public String greetUser() {
		
		return "Wellcome to chap-01 of book";
		
	}

	
}
