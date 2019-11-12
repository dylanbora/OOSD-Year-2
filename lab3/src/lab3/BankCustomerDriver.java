package lab3;

public class BankCustomerDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankCustomer bc = new BankCustomer("Dylan" , "Kilkenny");
		SavingsAccount sa = new SavingsAccount(2000.00);
		bc.addAccount(sa);
		

		SavingsAccount sa2 = new SavingsAccount(3000.00);
		bc.addAccount(sa2);
		
		System.out.println(bc);
		
		for(SavingsAccount sav:bc.getSaveAcc()) {
			if(sav != null) {
				System.out.println("Account Number: " + sav.getAccNum() + "\t" + "Account Balance: " + sav.getAccBalance());
			}
		}
		
		System.out.println("Total Balance: " + bc.balance(bc.getSaveAcc()));
	}

}
