package lab3;

public class SavingsAccount {
	
	// Variables 
	
	private int accNum;
	private static int nextAccNum;
	private static float annualInterestRate;
	private double accBalance;



	// Constructors

	 public SavingsAccount() {
		++nextAccNum;
		setAccNum(nextAccNum); 
	 
	 }
	 

	public SavingsAccount(double accBalance) {
		++nextAccNum;
		setAccNum(nextAccNum); 
		setAccBalance(accBalance);
	}


	// Getters and Setters

	 public int getAccNum() {
		 return accNum;
	 }

	 public void setAccNum(int accNum) {
	 	this.accNum = accNum;
	 }

	 public static int getNextAccNum() {
	 	return nextAccNum;
	 }

	 public static void setNextAccNum(int nextAccNum) {
		 SavingsAccount.nextAccNum = nextAccNum;
	 }


	 public float getAnnualInterestRate() {
		 return annualInterestRate;
	 }


	 public static void modifyAnnualInterestRate(float annualInterestRate) {
		 SavingsAccount.annualInterestRate = annualInterestRate;
	 }

	 public double getAccBalance() {
		 return accBalance;
	 }

	 public void setAccBalance(double accBalance) {
	 	this.accBalance = accBalance;
	 }

	 // toString 
	 @Override
	 public String toString() {
	  	return "SavingsAcc [accNum = " + accNum + ", accBalance = " + accBalance
		 		+ "]";
	 }


	 // Other Methods
	 public void calculateInterest() {
	 	double interest = (getAccBalance() * getAnnualInterestRate()) / 12 ;
		setAccBalance(getAccBalance() + interest);
	 }

}


