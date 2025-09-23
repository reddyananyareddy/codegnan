//23-09-2025
package com.codegnan.oop.overriding;

import java.util.Scanner;

public class Cube extends Shape {
	public void calculateVolume(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side of the cube:");
		double side=sc.nextDouble();
		double volume=Math.pow(side,3);
		System.out.printf("Volume of Cube: %.2f\n",volume);
	}
}
