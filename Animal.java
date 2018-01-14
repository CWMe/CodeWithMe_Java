public abstract class Animal {

	private int age = 0;
	public Animal(){}
	public Animal(int age){
		this.age = age;
	}

	public int getAge(){
		return age;
	}
	
	public void speak(){
		System.out.println("Hello");
	}
}