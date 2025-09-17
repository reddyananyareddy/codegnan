//17-09-2025
package com.codegnan.oopexamples;

public class Student {
String name;
int[] marks;

public void setDetails(String n,int[] m) {
	name=n;
	marks=m;	
}

public int calculateTotal(){
	int total=0;
	for(int mark:marks) {
		total+=mark;
	}
	return total;
}

public double calculateAvg() {
	return (double)calculateTotal()/marks.length;
}

public void displayDetails() {
	System.out.println("Name: "+name);
	System.out.println("Total: "+calculateTotal());
	System.out.println("Average: "+calculateAvg());
	
}
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setDetails("Ananya", new int[] { 50, 49, 34, 23, 45, 67, 88, 23 });
		s1.displayDetails();

	}

}
