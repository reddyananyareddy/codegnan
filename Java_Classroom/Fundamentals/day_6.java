package com.codegnan.fundamentals;

import java.util.Scanner;

public class day_6 {

	public static void main(String[] args) {
		
		//nested ternary operator
	
		Scanner sc=new Scanner(System.in);
		
		
		//bill calculator after discount
		/*double amount=sc.nextDouble();
		double d1=0.2,d2=0.1,d3=0.0;
		double discount=(amount>=100)?d1:((amount>=50)?d2:d3);
		double bill=amount-amount*discount;
		System.out.println(bill); */
		
		//marks based grade display
		int marks=sc.nextInt();
		char g1 ='O',g2 ='A',g3 ='B',g4 ='C',g5 ='D',g6 ='E',g7 ='F';
		char grade=(marks>=90)?g1:(marks>=80)?g2:(marks>=70)?g3:(marks>=60)?g4:(marks>=50)?g5:(marks>=40)?g6:g7;
		System.out.println(grade);
		
		sc.close();


	}

}
