package com.spring.inj;

public class Car implements Vehicle
{
	public Car()
	{
		System.out.println("Car created");
	}
	public void ride()
	{
		System.out.println("Car riding started");
	}

}
