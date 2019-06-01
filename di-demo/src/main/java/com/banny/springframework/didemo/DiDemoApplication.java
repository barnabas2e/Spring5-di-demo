package com.banny.springframework.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.banny.springframework.didemo.controllers.GreetController;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
	  ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
	  GreetController lGreetController = (GreetController) ctx.getBean("greetController");
	  lGreetController.seyHello();	  
	}
}
