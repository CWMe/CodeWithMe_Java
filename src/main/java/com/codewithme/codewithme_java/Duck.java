package com.codewithme.codewithme_java;

public class Duck extends Bird implements Flight, Swim {

	public Duck(int age) {
		super(age);
	}

	private final int flightSpeed = 15;
	private final int nauticalSpeed = 25;

	public int getFlightSpeed(){
		return flightSpeed;
	}

	public int getNauticalSpeed(){
		return nauticalSpeed;
	}
	
        @Override
	public void fly(){ 
		System.out.println("Flap Flap");
	}
	
        @Override
	public void speak(){
		System.out.println("Quack Quack");
	}
	
        @Override
	public void swim(){
		System.out.println("Splash");
	}
}
