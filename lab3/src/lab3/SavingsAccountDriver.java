package lab3;

public class SavingsAccountDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SavingsAccount saver1 = new SavingsAccount();
		saver1.setAccBalance(2000);
		
		
		SavingsAccount saver2 = new SavingsAccount(3000.00);
		
		
		SavingsAccount.modifyAnnualInterestRate(0.04f);
		
		saver1.calculateInterest();
		saver2.calculateInterest();
		
		System.out.println(saver1);
		System.out.println(saver2);
		
		SavingsAccount.modifyAnnualInterestRate(0.05f);
		
		saver1.calculateInterest();
		saver2.calculateInterest();
		
		System.out.println(saver1);
		System.out.println(saver2);
		
	}

}
