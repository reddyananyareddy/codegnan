//09-10-2025
package com.codegnan.oop.interfaces;

import java.util.Scanner;

public class CheckPassword {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Password: ");
		String password=sc.nextLine();
		PasswordChecker c=new SimplePasswordChecker();
		System.out.println(c.checkLength(password));
		System.out.println(c.checkComplexity(password));
		sc.close();
	}

}
