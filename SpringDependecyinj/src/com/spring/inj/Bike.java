package com.spring.inj;

public class Bike implements Vehicle
{
	public Bike()
	{
		System.out.println("Bike created");
	}
	public void ride()
	{
		System.out.println("Bike riding started");
	}
}
