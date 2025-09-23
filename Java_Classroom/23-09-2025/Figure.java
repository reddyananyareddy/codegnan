//23-09-2025
package com.codegnan.oop.overriding;
//super class
public class Figure {
	double dim1;
	double dim2;
	public Figure(double dim1,double dim2) {
		super();
		this.dim1=dim1;
		this.dim2=dim2;
	}
	public double area() {
		return dim1*dim2;
		
	}

}
