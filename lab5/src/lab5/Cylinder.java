package lab5;

public class Cylinder extends Circle {


	// Variables
	
	private static float rad;
	protected int height;

	
	// Constructors 
	
	public Cylinder( int x , int y ,int height) {
		super(x , y , rad);
		setHeight(height);
	}
	
	
	// Getters & Setters
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	

	// toString
	@Override
	public String toString() {
		return "Cylinder [height=" + height + "]";
	}


	
}
