//23-09-2025
package com.codegnan.oop.overriding;

import java.util.Scanner;

public class Cuboid extends Shape {
	public void calculateVolume(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the cuboid:");
		double length=sc.nextDouble();
		System.out.println("Enter the width of the cuboid:");
		double width=sc.nextDouble();
		System.out.println("Enter the height of the cuboid:");
		double height=sc.nextDouble();
		double volume=length*width*height;
		System.out.printf("Volume of Cuboid: %.2f\n",volume);
		sc.close();
	}
}
