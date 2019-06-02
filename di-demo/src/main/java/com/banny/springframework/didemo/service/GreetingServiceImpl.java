package com.banny.springframework.didemo.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
	
	public static final String WELCOME_MESSAGE = "Hello, welcome to Spingframework 5";
	
	@Override
	public String greet() {
		
		return WELCOME_MESSAGE;
	}

}
