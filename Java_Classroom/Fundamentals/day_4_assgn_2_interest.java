//23-08-2025
/*2.Write a Java program to calculate Simple Interest and Compound Interest, where the time is entered in months. 
Input: 
Principal amount (double)
Annual rate of interest in percentage (double)
Time in months (int)
Requirements:
Convert time in months to years.

Calculate:
Simple Interest using the formula:
SI=(Principal X Rate X Time)/100
Compound Interest using the formula:
CI=Principal X (1+ Rate/100)^Time-Principal

Print both interests and their corresponding total amounts.
Output:
Time in years (converted from months)
Simple Interest and Total with Simple Interest.
Compound Interest and Total with Compound Interest. 

*code*
----------------------------------------------------- */
package com.codegnan.fundamentals;

import java.util.Scanner;
public class day_4_assgn_2_interest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double P=1000;    //Principal amount (double)
		double R=2.5;  //Annual rate of interest in percentage (double)
		int T=10*12; //Time in months
		double SI=P*(T/12.0)*R/100.0;  //simple interest
		//Simple Interest
		System.out.println("Simple Interest: "+SI);
		double Amt1=P+SI;
		System.out.println("Total Amount: "+Amt1);
		//Compound Interest
		double CI=P*Math.pow((1+R/100.0),T/12.0)-P;  //compound interest
		System.out.println("Compound Interest: "+CI);
		double Amt2=P+CI;
		System.out.println("Total Amount: "+Amt2);
		
		sc.close();
	}
}


