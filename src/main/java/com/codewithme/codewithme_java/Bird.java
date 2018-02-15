package com.codewithme.codewithme_java;

public class Bird extends Animal implements Flight {

	private final int flightspeed = 10;
	
	public Bird(int age) {
		super(age);
	}

        @Override
	public void speak(){
		System.out.println("Ka ka");
	}
	
        @Override
	public void fly(){
		System.out.println("Whoosh");
	}
}
