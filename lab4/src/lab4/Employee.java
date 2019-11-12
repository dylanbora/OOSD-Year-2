package lab4;

public class Employee {

	// Variables 
		private static int nextEmployeeNum = 1000;
		private int employeeNum;
		private String firstName;
		private String lastName;
		private Address address;
		private String empType;
		private String compCarType;
		
		
		
		// Constructors 
		public Employee(String firstName, String lastName, Address address, String empType) {
			super();
			setFirstName(firstName);
			setLastName(lastName);
			setAddress(address);
			setEmpType(empType);
			nextEmployeeNum++;
		}
			
		// Getters and Setters 
		
		public int getEmployeeNum() {
			return employeeNum;
		}

		public void setEmployeeNum(int employeeNum) {
			this.employeeNum = employeeNum;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public Address getAddress() {
			return address;
		}
		public void setAddress(Address address) {
			this.address = address;
		}
		public String getEmpType() {
			return empType;
		}
		public void setEmpType(String empType) {
			this.empType = empType;
		}
		public String getCompCarType() {
			return compCarType;
		}
		public void setCompCarType(String compCarType) {
			this.compCarType = compCarType;
		}
		
		// Other Methods 
		
		public static int getNumEmployeeRecords() {
			return nextEmployeeNum - 1000;
		}
		
		// toString
		
		@Override
		public String toString() {
			return "Office [employeeNum=" + employeeNum + ", firstName=" + firstName + ", lastName=" + lastName
					+ ", address=" + address + ", empType=" + empType + ", compCarType=" + compCarType + "]";
		}
		

	} // End class 
