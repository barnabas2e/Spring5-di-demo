package com.banny.springframework.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.banny.springframework.didemo.service.GreetingService;

@Controller
public class ConstructorInjectedController {

	private GreetingService greetingService;
	
	@Autowired //constructor injected dependency is auto injected by Spring. therefore, the explicit @Autowire annotation can be omitted in this case.
	public ConstructorInjectedController(GreetingService pGreetingService) {
		this.greetingService = pGreetingService;
	}
	
	public String sayWelcome() {
		return greetingService.greet();
	}
	
}
