//23-09-2025
package com.codegnan.oop.overriding;

public class Rectangle extends Figure {
	public Rectangle(double a,double b) {
		super(a,b);
	}
	public double area() {
		System.out.println("Area of Rectangle:");
		return dim1*dim2;
	}
}
