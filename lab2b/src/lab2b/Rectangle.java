package lab2b;

public class Rectangle {

	// Variables 
	private float width;
	private float length;
	
	
	
	// Constructors 
	public Rectangle() {
		
		setWidth(1);
		setLength(1);
	}
	
	public Rectangle(float width, float length) {
		
		setWidth(width);
		setLength(length);
	}


	// Getters and setters 
	public float getWidth() {
		return width;
	}
	
	public void setWidth(float width) {
		
		if (width > 0.0 && width <= 40.0) {
		this.width = width;
		}
		
		else {
			System.out.println("Width is not in the required range!");
		}
	}
	
	public float getLength() {
		return length;
	}
	
	public void setLength(float length) {
		this.length = length;
		
		if (length > 0.0 && length <= 40.0) {
			this.length = length;
			}
			
			else {
				System.out.println("Length is not in the required range!");
			}
	}
	
	
	// Other Methods
	public double getArea() {
		
		return this.length * this.width;
		
	}
	
	public double getPerimeter() {
		
		return (this.length + this.width) * 2 ;
	}

	public void printRectangle() {
		
		String astrix = "*";
		
		for ( int i = 0 ; i > width - 1 ; i++) {
			astrix = "*";
		}
		
		System.out.println(astrix);
		
		for ( int j = 0; j < length - 2 ; j++) {
			System.out.print("*");
			
			for (int x = 0 ; x < width ; x++) {
				System.out.print("*");
			}
			
			System.out.print(astrix);
		}
	}
	
	
	// toString
	
	/*public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + "]";
	}*/
	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + ", getWidth()=" + getWidth() + ", getLength()="
				+ getLength() + ", getArea()=" + getArea() + ", getPerimeter()=" + getPerimeter() + "]";
	}
	
	
	
	
	
	

}
