import java.util.Arrays;

public class Student extends Person {

	
	// Variables 
	
	private int numCourses;
	private String[] courses; // Declaring array 
	private int [] grades;
	private static int MAX_COURSES = 10;
	
	
	// Constructors 
	
	public Student(String name, String address) {
		
		super(name, address);
		numCourses = 0;
		courses = new String[MAX_COURSES]; // initializing array
		grades = new int[MAX_COURSES];
	}
	
	
	// Getters & Setters 
	
	
	
	
	// Other Methods
	
	public void addCourseGrade(String course , int grade) {
		
		courses[numCourses] = course;
		grades[numCourses] = grade;
		numCourses++;
		
	}

	public void printGrades() {
		
		System.out.println(this); // print THIS object
		
		for ( int i = 0 ; i <= courses.length - 1; i++ ) {
			
			System.out.println("Course: " + courses[i] + "\t" + "Grade: " + grades[i]);
		}
		
	}

	public double getAverageGrade() {
		
		double average = 0;
		
		for(int gr:grades) { // for each loop 
			
			average += gr;
			
		}
		
		return average/numCourses;
	}

	
	
	// ToString
	
	@Override
	public String toString() {
		return "Student [numCourses=" + numCourses + ", courses=" + Arrays.toString(courses) + ", grades="
				+ Arrays.toString(grades) + "name = " + super.toString() + "]";
	}
	


} // End Class
