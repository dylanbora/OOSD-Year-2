package lab7;

public class Vet {

	// Variables 
	private String name;


	
	// Constructors 
	public Vet(String name) {
		
		setName(name);
	}
	
	
	// Getters and Setters 
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	// other Methods 
	
	public void vaccinate(Animal[] a) {
	
		for (Animal an: a) {
			
			System.out.println(this.name + " is vaccinating");
			System.out.println(an.getClass().getName());
			System.out.println("The " + an.getClass().getName() + " has been vaccinated " + an.toString());
		}
		
	}


	
	
	// toString



} // end class
