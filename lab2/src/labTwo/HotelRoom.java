package labTwo;

public class HotelRoom {
	
	// Variables
	private int roomNum;
	private String roomType; 
	private boolean occupied;
	private double rate;
	
	
	// Default Constructor
	public HotelRoom() {
		
		setRoomNum  (0);
		setRoomType ("");
	}
		
	

	// constructor that takes parameters
	public HotelRoom(int roomNum, String roomType) {
		
		setRoomNum  (roomNum);
		setRoomType (roomType);
	}
	
public HotelRoom(int roomNum, String roomType , boolean occupied , double rate) {
		
		setRoomNum  (roomNum);
		setRoomType (roomType);
		setOccupied (occupied);
		setRate		(rate);
	}

	

	// Getters and Setters
	public int getRoomNum() {
		
		return roomNum;
	}

	public void setRoomNum(int roomNum) {
		
		this.roomNum = roomNum;
	}

	public String getRoomType() {
		
		
		return roomType;
	}

	public void setRoomType(String roomType) {
		
		this.roomType = roomType;
	}
	
	
	
	public boolean isOccupied() {
		
		return occupied;
	}



	public void setOccupied(boolean occupied) {
		
		this.occupied = occupied;
	}



	public double getRate() {
		
		return rate;
	}



	public void setRate(double rate) {
		
		this.rate = rate;
	}


	// bringing down a method from a superclass to sub class
	@Override 
	public String toString() {
		
		return "HotelRoom [roomNum=" + roomNum + ", roomType=" + roomType + ", occupied=" + occupied + ", rate=" + rate + "]";
	}



	
	

}
