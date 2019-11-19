package lab9;

public abstract class LibraryItem implements LoanItem {

	// Variables 
	String type , ID;
	

	// Constructor 
	public LibraryItem(String type, String iD) {
	
		setType(type);
		setID(iD);
	}
	
	
	// Getters & Setters 
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	
	
	// Other Methods
	
	@Override
	public void calculatePrice() {
		// TODO Auto-generated method stub
		
	}
	
	
	// toString
	
	

}
