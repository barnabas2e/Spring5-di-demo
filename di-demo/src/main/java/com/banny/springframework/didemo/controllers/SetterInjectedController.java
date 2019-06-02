package com.banny.springframework.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.banny.springframework.didemo.service.GreetingService;

@Controller
public class SetterInjectedController {
	
 private GreetingService greetingService;
 
 
	public String sayWelcome() {
		return greetingService.greet();
	}
	
	@Autowired
	public void setGreetingServiceImpl(GreetingService pGreetingService) {
		this.greetingService = pGreetingService;
	}
}
