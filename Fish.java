
public class Fish extends Animal implements Swim {

	int nauticalspeed = 10;
	
	public Fish(int age) {
		super(age);
	}
	public void speak(){
		System.out.println("Fish Sound");
	}
	
	public void swim(){
		System.out.println("Splash");
	}
	
}
