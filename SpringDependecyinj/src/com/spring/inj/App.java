package com.spring.inj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App {

	public static void main(String[] args)
	{
		ApplicationContext cont=new ClassPathXmlApplicationContext("spring.xml");
		Vehicle at=(Vehicle)cont.getBean("Vehicle");
		at.ride();

	}

}
