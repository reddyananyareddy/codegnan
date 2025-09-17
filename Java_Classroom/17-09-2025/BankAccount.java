//17-09-2025
package com.codegnan.oopexamples;

public class BankAccount {
	double balance;
	public BankAccount(double balance) {
		this.balance=balance;
	}
	
	//Amount
	public void deposit(double amount) {
		balance+=amount;
		System.out.println("Deposited Cash: "+amount);
	}
	
	//Transaction ID
	//Bank Name
	public void deposit(double amount,String chequeNumber) {
		System.out.println("Deposited Cash: "+amount+ " via chequeNumber #"+chequeNumber);
	}
	
	
	public void deposit(double amount,String transactionId,String bankName) {
		balance=balance+amount;
		System.out.println("Deposited "+amount+ " via online transfer");
		System.out.println("Transaction ID: "+transactionId+ " Bank: "+bankName);
	}
	public void showBalance() {
		System.out.println("Current balance is: "+balance);
	}

	
}
