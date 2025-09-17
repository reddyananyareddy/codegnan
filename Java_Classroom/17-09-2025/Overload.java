//17-09-2025
package com.codegnan.oopexamples;

public class Overload {

	public static void main(String[] args) {
		OverloadDemo o1=new OverloadDemo();
		o1.test();
		o1.test(10);
		o1.test(20,30);
		System.out.println(o1.test(12.5));
	}
}
