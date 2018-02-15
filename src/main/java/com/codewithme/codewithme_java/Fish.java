package com.codewithme.codewithme_java;

public class Fish extends Animal implements Swim {

	int nauticalspeed = 10;
	
	public Fish(int age) {
		super(age);
	}
        
        @Override
	public void speak(){
		System.out.println("Fish Sound");
	}
	
        @Override
	public void swim(){
		System.out.println("Splash");
	}
	
}
