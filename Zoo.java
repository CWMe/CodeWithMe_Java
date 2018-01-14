
public class Zoo {

	public static void main(String[] args) {
		
		Dog Fido = new Dog(8);
		Dog Spark = new Dog();
		Fido.speak();
		Spark.speak();
		System.out.println("Fido's age is : " + Fido.getAge());
		System.out.println("Spark's age is : " + Spark.getAge());

		Duck Daffy = new Duck(10);
		System.out.print("Daffy says hi or should I say: ");
		Daffy.speak();
		System.out.println("Daffy's age is : " + Daffy.getAge());
		System.out.println("Daffy swims at " + Daffy.getNauticalSpeed() + " knots.");
		System.out.println("Daffy flies at " + Daffy.getFlightSpeed() + " knots.");


		Human Shijit = new Human();
		System.out.println("Shijit's Birthdate is " + Shijit.getDateofBirth());
		System.out.println("Shijit's SSN is " + Shijit.getSSN());
	}

}
