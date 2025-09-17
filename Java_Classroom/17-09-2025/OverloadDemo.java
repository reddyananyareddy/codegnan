//17-09-2025
package com.codegnan.oopexamples;

public class OverloadDemo {
	
	public void test() {
		System.out.println("No Parameters");
	}
	
	public void test(int a) {
		System.out.println("A: "+a);
	}
	
	public void test(int a,int b) {
		System.out.println("a and b are: "+a+" & "+b);
	}
	
	public double test(double a) {
		System.out.println("Double a: "+a);
		return a*a;
	}

	public static void main(String[] args) {
		

	}

}
