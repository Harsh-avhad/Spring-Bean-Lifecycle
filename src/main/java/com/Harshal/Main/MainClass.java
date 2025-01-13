package com.Harshal.Main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Harshal.Beans.Motor;


public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Beans.xml");
		
		Motor motor = context.getBean(Motor.class);
		
		motor.doWork();
		
		ConfigurableApplicationContext cfgCtxt = (ConfigurableApplicationContext)context;
		cfgCtxt.registerShutdownHook();
		
	
		
	}
}
