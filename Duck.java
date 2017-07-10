
public class Duck extends Bird implements Flight, Swim {

	public Duck(int age) {
		super(age);
	}

	int flightspeed = 15;
	int nauticalspeed = 25;
	
	public void fly(){ 
		System.out.println("Flap Flap");
	}
	
	public void speak(){
		System.out.println("Quack Quack");
	}
	
	public void swim(){
		System.out.println("Splash");
	}
}
