//23-08-2025
//1.Area of_circle
package com.codegnan.fundamentals;

import java.util.Scanner;
public class day_4_1_area_of_circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in); 
		//warning in 8th line because scanner class is not closed scanner.close();

	
		double radius=sc.nextDouble();
		double area=(22/7.0)*(radius*radius);
		System.out.println(area);
		
		sc.close();
	}

}

