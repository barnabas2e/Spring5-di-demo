package com.banny.springframework.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.banny.springframework.didemo.controllers.ConstructorInjectedController;
import com.banny.springframework.didemo.controllers.GreetController;
import com.banny.springframework.didemo.controllers.PropertyInjectedController;
import com.banny.springframework.didemo.controllers.SetterInjectedController;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
	  ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
	  GreetController lGreetController = (GreetController) ctx.getBean("greetController");
	  lGreetController.seyHello();	 
	  
	  System.out.println(ctx.getBean(PropertyInjectedController.class).sayWelcome());
	  System.out.println(ctx.getBean(SetterInjectedController.class).sayWelcome());
	  System.out.println(ctx.getBean(ConstructorInjectedController.class).sayWelcome());
	}
}
