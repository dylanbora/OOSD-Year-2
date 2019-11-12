package lab4;

import java.util.Scanner;

public class MyHR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int choice =0;
		Employee[] emps = new Employee[5];
		Office[] offices = new Office[3];
		
		for(int i = 0; i <= 2; i++) {
		 
			Office off = new Office();
			offices[i] = off;
			
			while( choice != 4) {
				
			System.out.println("Please Select an option");
			System.out.println("1. List all offices");
			System.out.println("2. Create new employee record");
			System.out.println("3. List all employees");
			System.out.println("4. Exit");
			
			choice = in.nextInt();
			}
		
			if(choice == 1) {
				for( Office of: offices){
				
					System.out.println(of.toString());
					
					if(of.getNumOfEmployees() != 0) {
						
						System.out.println("Employee" + "\n" + of.PrintEmployee());
					}
				}
			}
			
			if(choice == 2) {
				if(Employee.getNumEmployeeRecords() <5 ) {
				
					String firstName;
					String lastName;
					String address;
					String city;
					String county;
					String empType;
					String compCarType =null;
					
					Scanner empIn = new Scanner(System.in);
					
					System.out.println("First Name");
					firstName = empIn.nextLine();
					
					System.out.println("Last Name");
					lastName = empIn.nextLine();
					
					System.out.println("Address");
					address = empIn.nextLine();
					
					System.out.println("City");
					city = empIn.nextLine();
					
					System.out.println("County");
					county = empIn.nextLine();
					
					System.out.println("Employee Type");
					empType = empIn.nextLine();
				}
				
				else {
					
					System.out.println("Reached the max number of records");
							
				}
			}
			
			if(choice == 3) {
				
				for(Employee emp:emps) {
					
					if(emp != null) {
					System.out.println(emp);
				}
				
			}

			if(choice == 4) {
	
			}
		
		}
	}
	}
}
