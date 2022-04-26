package com.tk.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobilePhone {

	public static void main(String[] args) {
		 /*USING CORE JAVA CONCEPT:
		  
		Airtel a = new Airtel();
		a.call();
		a.data();
		
		BSNL b = new BSNL();
		b.call();
		b.data();
		*/
		
		//USING SPRING FRAMEWORK
		
		ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
		
		/*
		 * THiS is like a hard code
		 
		Airtel a = (Airtel) c.getBean("airtel");
		a.call();
		a.data();
		*/
		
		sim s =c.getBean("sim",sim.class);
		s.call();
		s.data();
	}
	

}
 