//23-09-2025
package com.codegnan.oop.overriding;

public class FindAreas {

	public static void main(String[] args) {
		Figure f=new Figure(10,10);
		f.area(); //no output reason??
		
		Rectangle r=new Rectangle(9,5);
		Triangle t=new Triangle(10,8);
		
		f=r;
		System.out.println("Area is "+f.area());
		f=t;
		System.out.println("Area is "+t.area());
	}

}
