//14-10-2025
package com.codegnan.exceptions;

public class BankAccount {
	private double balance=0;
	public void withDraw(double amount)throws Exception{
		if(amount>balance)
			throw new Exception("Insufficient Funds");
		if(amount<=0)
			throw new Exception("Invalid Amount");
		balance-=amount;
	}
	public static void main(String[] args) throws Exception {
		BankAccount b=new BankAccount();
		b.withDraw(1000);
	}
}
