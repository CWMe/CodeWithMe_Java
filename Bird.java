
public class Bird extends Animal implements Flight {

	int flightspeed = 10;
	
	public Bird(int age) {
		super(age);
	}

	public void speak(){
		System.out.println("Ka ka");
	}
	
	public void fly(){
		System.out.println("Whoosh");
	}
}
