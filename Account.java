package jUnitTesting;

public class Account {
	
	private String name;
	private int age;
	private double balance;
	private int numberOfTransactions;
	double TRANSACTION_FEE = 0.5;
	double chargeAmount= 0;
	double interest = 0;
	double annualCharge = 0;
	
	public Account(String name, int age, double balance) {
		this.name = name;
		this.age = age;
		this.balance = balance;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String withDrawMoney(double amount) {
		String transaction = "";
		if (amount <= balance) {
			balance = balance - amount;
			numberOfTransactions++;
			transaction = "TAKE MONEY";
		} else {
			transaction = "FUNDS LOW";
		}
		
		return transaction;
	}
	
	public void depositMoney(double amount) {
		
		balance = balance + amount;
		numberOfTransactions++;
	}
	public double calculateBankCharges() {
		chargeAmount = chargeAmount + TRANSACTION_FEE * numberOfTransactions;
		return chargeAmount;
	}
	
	public double calculateInterestDue() {
		interest = balance*0.1;
		return interest;
	}
	
	public double getAnnualCharge() {
		
		if (age<18) {
			annualCharge = 0;
		} else if (age <= 65) {
			annualCharge = 10;
		} else {
			annualCharge = 5;
		}
		
		return annualCharge;
	}
}
