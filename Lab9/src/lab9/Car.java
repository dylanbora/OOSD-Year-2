package lab9;

public class Car extends RoadVehicle{
		
	
	private String carType;
	 
	public Car() {
		 this("", 0, 0);
	}
	 
	public Car(String c, int w, int p) { 
		super(w, p);
		setType(c);
	}
	 
	public void setType(String t)  {
		carType = t;
	}
	 
	public String getType() {
		return carType;
	}

	
	@Override
	public void CalculateDuty() {
		
		System.out.println("The truck costs: " + (getWheels() * 10) + (getPass() * 5) / 100 + getWheels() * CARTAXRATE + " Euro");
		
		super.CalculateDuty();
	}
	
	
}
