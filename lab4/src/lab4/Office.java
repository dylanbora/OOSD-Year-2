package lab4;

import java.util.Arrays;

public class Office {

	// Variables 
		private static int nextRoomNum;
		private int roomNum;
		private int numOfEmployees;
		private Employee[] employees = new Employee[2];

			
		// Constructors 
		public Office() {
			setRoomNum(nextRoomNum);
			nextRoomNum ++;
		}
			
			
		// Getters and Setters 
		
		public int getRoomNum() {
			return roomNum;
		}
		public void setRoomNum(int roomNum) {
			this.roomNum = roomNum;
		}
		public int getNumOfEmployees() {
			return numOfEmployees;
		}
		public void setNumOfEmployees(int numOfEmployees) {
			this.numOfEmployees = numOfEmployees;
		}
		
			
		// Other Methods 
		
		public void addEmployee(Employee employee) {
			if (numOfEmployees <= 2 ) {
				employees[numOfEmployees] = employee;
				numOfEmployees ++;
			}
			else {
				System.out.println("Max number of employees reached.");
			}
		}
		
		public String PrintEmployee() {
			
			String details ="";
			
			for (Employee employee:employees){
				if (employees !=null) {
					details += employee.getEmployeeNum() + "," + employee.getFirstName() + "," + employee.getLastName() + "\n";
				}
			}
			
			return details;
		}

						
		// toString
		
		@Override
		public String toString() {
			return "Office [roomNum=" + roomNum + ", numOfEmployees=" + numOfEmployees + ", employees="
					+ Arrays.toString(employees) + "]";
		}
		
		
	}

