package lab5;

public class Point extends Object {
	
	// Variables 
	
	protected int y;
	protected int x;
	
	
	// Constructors 
	
	
	public Point() {
		this(0 ,0);
		// TODO Auto-generated constructor stub
	}

	public Point(int y, int x) {
		setY(y);
		setX(x);
	}
	
	
	// Getters & Setters 
	
	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	
	// Other Methods 
	
	
	// toString

	@Override
	public String toString() {
		return "Point [y=" + y + ", x=" + x + "]";
	}
	
} // end class
