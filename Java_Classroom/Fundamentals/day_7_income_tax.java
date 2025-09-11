//28-08-2025
/*Write a java program that calculates the income tax based on the user's salary:
  If the income is less than 300,000 the tax rate is 5%.
  If the income is between 300,000 and 1,000,000 the tax rate is 10%.
  If the income is more than 1,000,000 the tax rate is 15%.
  Additionally, if the income is over 2,000,000, apply a special bonus of 1% on the total amount.
 */
package com.codegnan.fundamentals;

import java.util.Scanner;

public class day_7_income_tax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		double tax_amt=(i<300000)?(i*0.05):(i>=300000&&i<=1000000)?(i*0.1):(i>1000000&&i<=2000000)?(i*0.15):((i*1.01)*0.15);
        //double balance=(i<300000)?(i-tax_amt):(i>=300000&&i<=1000000)?(i-tax_amt):(i>1000000)?(i-tax_amt);
		System.out.println(tax_amt);
		
		sc.close();
	}

}


