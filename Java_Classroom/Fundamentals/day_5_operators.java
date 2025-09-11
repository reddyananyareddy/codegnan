//25-08-2025
//Operators
package com.codegnan.fundamentals;

public class day_5_operators {

	public static void main(String[] args) {
		//Arithmetic Operators
		//System.out.println(10/0); //Arithmetic Exception
		System.out.println(10.0/0); //Infinity
		System.out.println(-10.0/0); //-Infinity
		System.out.println(0.0/0); //NaN --> not a number
		System.out.println(-0.0/0);//NaN
		
		//String Concatenation Operator
		int a=10,b=20,c=30;
		String d="codegnan";
		System.out.println(a+b+c+d); //60codegnan
		System.out.println(b+c+d+a); //50codegnan10
		System.out.println(c+d+a+b); //30codegnan1020 //c+d = 30codegnan is string; 30codegnan+a=30codegnan10;
		System.out.println(d+a+b+c); //codegnan102030
		
		
		a=a+b+c;
		System.out.println(a);
		//d=a+b+c; //int can be stored in string
		System.out.println(d);
		d=a+b+c+d; //string can be stored in string
		System.out.println(d);
		//a=a+b+d; //string cannot be stored in int
		System.out.println(a); 
		
		
		//Increment Operators
		int x=10;
		int y=++x;
		System.out.println(x);
		System.out.println(y);
		int m=10;
		int n=m++;
		System.out.println(m);
		System.out.println(n);
		
		//Logical Operators
		boolean p=true,q=false;
		System.out.println(p^q);
		
		int i=10,k;
		k=i<0?-i:i;
		System.out.println("absolute value of");
		System.out.println(i+" is "+k);
		
		int age=20;;
		String result = age>=18?"eligible":"not eligible";
		System.out.println(result);
		
	
		
		
		

	}

}
