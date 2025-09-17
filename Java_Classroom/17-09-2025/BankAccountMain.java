//17-09-2025
package com.codegnan.oopexamples;

public class BankAccountMain {

	public static void main(String[] args) {
		BankAccount account=new BankAccount(5000);

		account.deposit(10000);
		account.deposit(2000,"CHQ1234");
		account.deposit(3000,"9876","SBI");
		account.showBalance();


	}

}
