package com.Harshal.Main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Harshal.Beans.Motor;


public class MainClass {

	public static void main(String[] args) {

		// Load Spring context
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Beans.xml");
		
		// Get the Motor bean
		Motor motor = context.getBean(Motor.class);
		
		// Call the method to simulate work
		motor.doWork();
		
		
		//call shut down hook--> @predestroy
		ConfigurableApplicationContext cfgCtxt = (ConfigurableApplicationContext)context;
		cfgCtxt.registerShutdownHook();
		
	
		
	}
}
