//25-08-2025

package com.codegnan.fundamentals;

import java.util.Scanner;
public class day_5_assgn {
	public static void main(String[] args) {
		
		//print next ASCII character
		Scanner sc=new Scanner(System.in);
		char a=sc.next().charAt(0);
		System.out.println(++a);
		sc.close();
		
		//Even or Odd
		int num=21;
		String r1 = num%2==0?"even":"odd";
		System.out.println(r1);
		
		//Leap Year
		int year=1900;
		String r2 = year%400==0 || (year%4==0&&!(year%100==0)) ?"leap":"not leap";
		//String res = year%4==0 && (year%100!=0 || year%400==0) ?"leap":"not leap";
		System.out.println(r2);
		
		//Assignment-3
		
		//positive or negative
		int number=-21;
		String r3 = number>0?"positive":"negative";
		System.out.println(r3);
		
		//greatest of 2 numbers
		int num1=1,num2=5;
		int r4 = num1>num2?num1:num2;
		System.out.println(r4);
		
		//student is pass or fail (>=35 --> pass)
		int marks=21;;
		String result = marks>=35?"pass":"fail";
		System.out.println(result);
		
		//number is divisible both 5 and 3
		int n=60;
		String r5 = (n%3==0 && n%5==0)?"divisible":"not divisible";
		System.out.println(r5);
		
		//if the bill amount > 1000 apply 10% discount
		double amt=100;
		double bill = amt>1000? bill=amt*0.9:amt;
		System.out.println(bill);

	}

}

