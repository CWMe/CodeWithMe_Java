package com.codewithme.codewithme_java;

public class Dog extends Animal {

	public Dog() {
		super();
	}
	public Dog(int age) {
		super(age);
	}
	
        @Override
	public void speak(){
		System.out.println("Woof");
	}
}
