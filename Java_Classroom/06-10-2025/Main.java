package com.codegnan.grocery;
public class Main{
	public static void main(String[] args){
		GroceryCalculator gc=new GroceryCalculator();
		double apple=gc.calculateTotal(30.2,2);
		double milk=gc.calculateTotal(60.0,4);
		double bill=apple+milk;
		System.out.println("Apple total: " + apple);
        	System.out.println("Milk total: " + milk);
        	System.out.println("Total bill: " + bill);
	}
}