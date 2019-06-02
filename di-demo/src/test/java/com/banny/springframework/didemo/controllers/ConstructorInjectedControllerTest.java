package com.banny.springframework.didemo.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.banny.springframework.didemo.service.GreetingServiceImpl;

public class ConstructorInjectedControllerTest {

	private ConstructorInjectedController constructorInjectedController;
	
	@Before
	public void setUp() {
		this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
	}
	
	@Test
	public void testSayWelcome(){
		assertEquals(GreetingServiceImpl.WELCOME_MESSAGE, constructorInjectedController.sayWelcome());
	}
}
