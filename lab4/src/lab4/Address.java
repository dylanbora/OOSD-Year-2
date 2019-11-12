package lab4;

public class Address {

	// Variables 
	private String street;
	private String city;
	private String county;
	
	
	
	// Constructors 
	public Address(String street, String city, String country) {
		super();
		setStreet(street);
		setCity(city);
		setCounty(county);
	}
	
	// Getters and Setters 
	

	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	
	// Other Methods 
	

	// toString 

	@Override
	public String toString() {
		return "Address [street=" + getStreet() + ", city=" + getCity() + ", county=" + getCounty() + "]";
	}
	
	
}
