package lab9;

public class LibraryDriver {

	public static void main(String[] args) {
		
		LibraryItem[] LI = new LibraryItem[2];
		Book bk = new Book ("Thriller"," A100 ","Ned Cashin","Java",500);
		CD cd = new CD ("Rock","CD200","Ger Dooley"," Planes", 19);

		LI[0] = bk;
		LI[1] = cd;
		
		for ( LibraryItem i:LI)i.calculatePrice(); 
	}

}
