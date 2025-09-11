//26-08-2025

/*You are tasked with writing a program that calculates the fare for a taxi ride based on: 
A base fare of 50 for the first 2 km. 
A rate of 15 per km for the next 8 km
A rate of 10 per km for distances above 10 km.
Additionally, if the distance is more than 20 km, the fare gets 5% discount. */


package com.codegnan.fundamentals;

import java.util.Scanner;
public class day_6_assgn {
	public static void main(String[] arg) { //'args' and be 'arg' or anything
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the distance travelled: ");
		double dist=sc.nextDouble();
		double f1=50,f2=15,f3=10,d=0.05;
		double fare=(dist<=2)?f1:
			        	(dist<=10)?(dist-2)*f2+f1:   //Next 8 kms
			        		(dist<=20)?(f1+8*f2+(dist-10)*f3): //no discount for dist=20km
			        			(f1+8*f2+(dist-10)*f3)*(1-d);
		
		System.out.println(fare);
		sc.close();
	}
}
