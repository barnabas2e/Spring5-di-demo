package com.banny.springframework.didemo.controllers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.banny.springframework.didemo.service.GreetingServiceImpl;

public class PropertyInjectedControllerTest {

	private PropertyInjectedController propertyInjectedController;
	
	@Before
	public void setUp() throws Exception {
		this.propertyInjectedController = new PropertyInjectedController();
		this.propertyInjectedController.greetingService = new GreetingServiceImpl();
	}
	@Test
	public void testSayWelcome() throws Exception {
		assertEquals(GreetingServiceImpl.WELCOME_MESSAGE, propertyInjectedController.sayWelcome());
	}
}
