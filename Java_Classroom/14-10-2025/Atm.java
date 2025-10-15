//14-10-2025
package com.codegnan.exceptions;
public class Atm {
	private double balance;
	private final int pin = 1234;
	private int pinAttempts = 0;
	public boolean verifyPin(int enteredPin) throws InvalidPinException {
		if (enteredPin == pin) {
			pinAttempts = 0;
			System.out.println("Access granted.");
			return true;
		} else {
			pinAttempts++;
			if (pinAttempts >= 3) {
				throw new InvalidPinException("Too many incorrect attempts. Access blocked.");
			} else {
				System.out.println("Invalid PIN. Attempts left: " + (3 - pinAttempts));
				return false;
			}
		}
	}
	public void depoist(double amount) throws InvalidAmountException {
		if (amount <= 0 || amount % 100 != 0) {
			throw new InvalidAmountException("Amount must be positive and multiple of 100!");
		}
		balance += amount;
		System.out.println("Deposit Succesful. New Balance is : " + balance);
	}
	public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
		if (amount <= 0 || amount % 100 != 0) {
			throw new InvalidAmountException("Amount Must be positive and Multiples of 100");
		}
		if (amount > balance) {
			throw new InsufficientFundsException("you can't withdraw more than your account balance");
		}
		balance -= amount;
		System.out.println("Withdrawal succesful. new Balance is : " + balance);
	}
	public void checkBalance() {
		System.out.println("Current balanace : " + balance);
	}
}

