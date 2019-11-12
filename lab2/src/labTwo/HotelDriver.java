package labTwo;

public class HotelDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HotelRoom room1 = new HotelRoom(200 , "single");
		room1.setOccupied(true);
		room1.setRate(100.0);
		
		
		HotelRoom room2 = new HotelRoom(201 , "double");
		room2.setOccupied(false);
		room2.setRate(80.0);
		
		HotelRoom room3 = new HotelRoom (202 , "single" , true , 90.0);
		
		HotelRoom[] rooms = new HotelRoom[3];
		
		rooms[0] = room1;
		rooms[1] = room2;
		rooms[2] = room3;
		
		for ( HotelRoom r :rooms) System.out.println(r.toString()); 
		
		/* System.out.println(room1.toString());
		System.out.println(room2.toString());
		System.out.println(room3.toString()); */

	} // end main

}
