package com.banny.springframework.didemo.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.banny.springframework.didemo.service.GreetingServiceImpl;

public class SetterInjectedConrollerTest {

	public SetterInjectedController setterInjectedController;
	
	@Before
	public void setUp() {
		this.setterInjectedController = new SetterInjectedController();
		this.setterInjectedController.setGreetingServiceImpl( new GreetingServiceImpl());
	}
	
	@Test
	public void testSayWelcome() {
		assertEquals(GreetingServiceImpl.WELCOME_MESSAGE, setterInjectedController.sayWelcome());
	}
}
