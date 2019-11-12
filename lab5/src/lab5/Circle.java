package lab5;

// extends means the new circle class has access to all of the variables and methods from the point class 
public class Circle extends Point{
	
	// Variables 
	protected float radius;

	
	
	// Constructors 
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Circle(int x , int y , float radius) {
		super(x , y); // calls the constructor with matching parameters 
		setRadius(radius);
	}

	// Getters & Setters 
	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

		
	// Other Methods 
	
	
	
	
	// toString
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", y=" + y + ", x=" + x + "]";
		// return super.toString() + getRadius();
	}

	
} // end class 
