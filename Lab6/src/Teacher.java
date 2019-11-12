import java.util.Arrays;

public class Teacher extends Person {

	
	// Variables 
	private int numCourses;
	private String[] courses; 
	private static int MAX_COURSES = 10;
	
	
	
	// Constructors 
	public Teacher(String name, String address) {
		super(name, address);
		numCourses = 0;
		courses = new String[MAX_COURSES]; 
	}
	
	
	// Getters 
	
	
	
	// Other Methods
	
	public boolean addCourse(String course) {
		
		for ( int i = 0; i < numCourses; i++ ) {
			
			if ( courses[i].equals(course)) {
				
				return false;
			}
			
			
		}
		
		courses[numCourses] = course;
		numCourses++;
		return true;
		
	}
	
	public boolean removeCourse(String course) {
		
		int courseIndex = numCourses;
		
		for (int i = 0; i <= numCourses; i++) {
			
			if ( courses[i].equals(course)) {
				
				courseIndex = i;
				break;
			}
		}
		
		if (courseIndex == numCourses) {
		
			return false;
		}
		else {
			
			for (int i = 0; i <= numCourses; i++) {
				
				courses[i] = courses[i+1];
				return true;
				
			}
			
			numCourses--;
			return true;
		}
		
	}

			
	// toString
	
	@Override
	public String toString() {
		return "Teacher [numCourses=" + numCourses + ", courses=" + Arrays.toString(courses) + "name = " + super.toString() + "]";
	}
	
	

	

}
