//23-09-2025
package com.codegnan.oop.overriding;

public class Triangle extends Figure {
	public Triangle(double b,double h) {
		super(b,h);
	}
	public double area() {
		System.out.println("Area of Triangle:");
		return (1/2f)*dim1*dim2;
	}

}
