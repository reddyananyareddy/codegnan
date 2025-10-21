//21-10-2025
package com.codegnan.collections;

public class BoxingUnboxingDemo {

	public static void main(String[] args) {
		int a=5; //primitive
		Integer obj=a; //auto boxing/primitive to object
		System.out.println("Primitive: "+a);
		System.out.println("Object(wrapper): "+obj);
		
		Double obj1=10.5; //object
		Double d=obj1; //object to primitive unboxing
		System.out.println("Wrapper Object: "+obj1);
		System.out.println("Primitive Value: "+d);

	}

}
