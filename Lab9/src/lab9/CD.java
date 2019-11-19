package lab9;

public class CD extends LibraryItem {

	
	// Variables
	
	String band , title;
	int numOfTracks;
	
	// Constructor
		public CD(String type, String iD , String band, String title , int numOfTracks) {
			super(type, iD);
			setBand(band);
			setTitle(title);
			setNumOfTracks(numOfTracks);
			// TODO Auto-generated constructor stub
		}
	
	
	// Getters & Setters
	public String getBand() {
		return band;
	}
	public void setBand(String band) {
		this.band = band;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}


	public int getNumOfTracks() {
		return numOfTracks;
	}
	public void setNumOfTracks(int numOfTracks) {
		this.numOfTracks = numOfTracks;
	}
	
	
	// Other Methods 
	@Override
	public void calculatePrice() {
		
		System.out.println("The CD costs: " + (getNumOfTracks() * 10 / 8 + " Euro"));
		
		super.calculatePrice();
	}


}
