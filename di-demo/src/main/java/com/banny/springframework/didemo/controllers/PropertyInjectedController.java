package com.banny.springframework.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.banny.springframework.didemo.service.GreetingServiceImpl;

@Controller
public class PropertyInjectedController {
 
	@Autowired
	public GreetingServiceImpl greetingService;
	
	public String sayWelcome() {
		return greetingService.greet();
	}
	
/*	public GreetingServiceImpl getGreetingService() {
		return greetingService;
	}*/
}
