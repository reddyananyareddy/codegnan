//22-09-2025
package com.codegnan.oop.overloading;

public class Child extends Parent {
	
	int x=20;
	public Child() {
		super();  //super() should be written inside constructor in the 1st line other wise error
		System.out.println("Child Constructor");
	}
	public void display() {
		super.display();
		System.out.println("child class display method");
		System.out.println("child x: "+x);
		System.out.println("parent x: "+super.x);
	}
	
	

}
