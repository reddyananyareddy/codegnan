//23-09-2025
package com.codegnan.oop.overriding;

public class Main {

	public static void main(String[] args) {
		
		Parent p1=new Parent();
		p1.property();
		p1.marry();
		//output
		//Cash/Land/Gold
		//Spouse
		
		Child c1=new Child();
		c1.property();
		c1.marry();
		//output
		//Cash/Land/Gold
		//Spouse1 / Spouse2 / Spouse3
		
		Parent p2=new Child();
		p2.property();
		p2.marry();
		//output
		//Cash/Land/Gold
		//Spouse1 / Spouse2 / Spouse3

	}

}
