
public class Duck extends Bird implements Flight, Swim {

	public Duck(int age) {
		super(age);
	}

	private int flightSpeed = 15;
	private int nauticalSpeed = 25;

	public int getFlightSpeed(){
		return flightSpeed;
	}

	public int getNauticalSpeed(){
		return nauticalSpeed;
	}
	
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
