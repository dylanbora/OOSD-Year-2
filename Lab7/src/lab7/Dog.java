package lab7;

public class Dog extends Animal {

	public Dog(String type, int age, char gender) {
		super(type, age, gender);
		
	}

	@Override
	public void eat() {
		
		System.out.println("Dog is eating");
	}

	@Override
	public void sleep() {

		System.out.println("Dog is sleeping");
		
	}

	@Override
	public void makeSound() {
	
		System.out.println("Woff");
	}

	
}// end class
