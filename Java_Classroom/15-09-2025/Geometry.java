//15-09-2025
package com.codegnan.oopexamples;

public class Geometry {
	//instance variables
	double base,height;
	double sideA,sideB,sideC;
	double radius;
	static final double pi=3.14159; //static variable
	
	//---instance methods in all 4 possible combinations---
	
	//1.With return with parameter calculate rectangle area
	public double calRectArea(double length,double breadth){
		return length*breadth;
	}
	//2.Without return with parameter --> print triangle perimeter
		public void printTrianglePerimeter(double a,double b,double c){
			double perimeter=a+b+c;
			System.out.println("Triangle Perimeter: "+perimeter);
		}
		
	//3.Without return without parameter //??--> print triangle perimeter
			public void displayData(){
				System.out.println("Stored Dimensions");
				System.out.println("Base:  "+base+" Height: "+height);
				System.out.println(sideA+","+sideB+","+sideC);
				System.out.println("Radius: "+radius);
			}
			
	//4.With return without parameter //??--> print triangle perimeter
			public double storedTriangleArea(){
				return 0.5*base*height;
			}
			
	//static methods
	//3.With return with parameter  -->  calculate circle area
	public static double calculateCircleArea(double radius) {
		return pi*radius*radius;
	}
			
	//2.Without return with parameter print circle circumference
	public static void printCircleCircumference(double radius) {
		double circumference=2*pi*radius;
		System.out.println("Circle Circumference: "+circumference);
	}
	
	//3.Without return without parameter
	public static void printFixedTrapeziumArea() {
		double a=8,b=6,h=4;
		double area=((a+b)/2)*h;
		System.out.println("Circle Circumference: "+area);
	}
	//4.With return without parameter
	public static double getFixedTriangleArea() {
		double base=5,height=3;
		return 0.5*base*height;
	}
	
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
