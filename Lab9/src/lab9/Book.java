package lab9;

public class Book extends LibraryItem {

	// Variables 
	String author , title;
	int numOfPages;
	
	// Constructor
	public Book(String type, String iD , String author, String title , int numOfPages) {
		super(type, iD);
		setAuthor(author);
		setTitle(title);
		setNumOfPages(numOfPages);
	}

	// Getters & Setters 
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumOfPages() {
		return numOfPages;
	}
	public void setNumOfPages(int numOfPages) {
		this.numOfPages = numOfPages;
	}
	
	// Other Methods 
	@Override
	public void calculatePrice() {
		
		System.out.println("The book costs: " + (getNumOfPages() * 10 / 300 + " Euro"));
		
		super.calculatePrice();
	}
	
}
