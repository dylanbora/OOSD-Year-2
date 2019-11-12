package lab3;

import java.util.Arrays;

public class BankCustomer {

	   // Variables
		private String name;
		private String address;
		private SavingsAccount[] saveAcc = new SavingsAccount[3];
		private int numOfAccounts;
		
		
		
		// Constructors

		public BankCustomer(String name, String address) {
			super();
			this.name = name;
			this.address = address;
		}
		// Getters and Setters
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		
		public SavingsAccount[] getSaveAcc() {
			return saveAcc;
		}
		public void setSaveAcc(SavingsAccount[] saveAcc) {
			this.saveAcc = saveAcc;
		}
		
		public int getNumOfAccounts() {
			return numOfAccounts;
		}

		public void setNumOfAccounts(int numOfAccounts) {
			this.numOfAccounts = numOfAccounts;
		}
		
		
		// Other Methods
		public void addAccount(SavingsAccount savingsaccount) {
			
			if(getNumOfAccounts()<=2) {
				this.saveAcc[getNumOfAccounts()] = savingsaccount;
				numOfAccounts++;
			}
			else {
				
				System.out.println("Max accounts reached!");
			}
		}
		
		public double balance(SavingsAccount[] savingsaccounts) {
			
			double balance = 0;
			
			for(SavingsAccount sa:savingsaccounts) {
				
				if(sa!= null) {
					balance += sa.getAccBalance();
				}
				
			}
			
			return balance;
			
		}
		
		
		// toString
		
		@Override
		public String toString() {
			return "BankCustomer [name=" + name + ", address=" + address + ", saveAcc=" + Arrays.toString(saveAcc)
					+ ", numOfAccounts=" + numOfAccounts + "]";
		}
		
		
		
	
}
