package com.codewithme.codewithme_java;

public class Zoo {

	public static void main(String[] args) {
		
		Animal Fido = new Dog(8);
		Animal Spark = new Dog();
		Fido.speak();
		Spark.speak();
		System.out.println("Fido's age is : " + Fido.getAge());
		System.out.println("Spark's age is : " + Spark.getAge());

		Animal Daffy = new Duck(10);
                Daffy.speak();
		System.out.println("Daffy's age is : " + Daffy.getAge());
                
                Duck melissa = new Duck(20);
		System.out.println("Daffy swims at " + melissa.getNauticalSpeed() + " knots.");
		System.out.println("Daffy flies at " + melissa.getFlightSpeed() + " knots.");

		Human Shijit = new Human();
		System.out.println("Shijit's Birthdate is " + Shijit.getDateofBirth());
		System.out.println("Shijit's SSN is " + Shijit.getSSN());
	}

}
