package lab9;

public class RoadDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RoadVehicle[] rv = new RoadVehicle[2];
		Car cr = new Car("" , 4 , 2);
		Truck tr = new Truck(30 , 4 , 6);
		
		rv[0] = cr;
		rv[1] = tr;
		
		for(RoadVehicle r:rv)r.CalculateDuty();
	}

}
