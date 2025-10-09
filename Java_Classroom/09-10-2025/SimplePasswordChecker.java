//09-10-2025
package com.codegnan.oop.interfaces;

public class SimplePasswordChecker implements PasswordChecker {

	@Override
	public String checkLength(String password) {
		return ("Length of password is: "+password.length());
	}

	@Override
	public String checkComplexity(String password) {
		if(password.length()<8) return "Weak";
		else if(password.length()==8) return "Medium";
		else return "Strong";
	}
	
}

