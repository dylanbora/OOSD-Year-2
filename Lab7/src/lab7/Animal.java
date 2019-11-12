package lab7;

public abstract class Animal {
	
	// Variables
	protected String type;
	protected int age;
	protected char gender;
	
	
	// Constructors
	public Animal(String type, int age, char gender) {
		super();
		setType(type);
		setAge(age);
		setGender(gender);
	}
	
	// Getters and Setters 
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	// Other methods
	public abstract void eat();
	public abstract void sleep();
	public abstract void makeSound();

	
	// toStirng
	@Override
	public String toString() {
		return "Animal [type=" + type + ", age=" + age + ", gender=" + gender + "]" + "\n";
	}
	
	
} // end class
