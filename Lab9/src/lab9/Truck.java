package lab9;

public class Truck extends RoadVehicle{
	private int cargo;

	public Truck(){ 	
		this(0,0,0);	
	}

	public Truck(int c, int w, int p){ 
		super(w, p);
		setCargo(c);
	}

	public void setCargo(int size){
		cargo = size;
		}

	public int getCargo(){
		return cargo;
		}

	@Override
	public void CalculateDuty() {
		
		System.out.println("The truck costs: " + (getWheels() * 10) + (getCargo() * 5) / 100 + getWheels() * CARTAXRATE + " Euro");
		
		
		super.CalculateDuty();
	}

	

}

