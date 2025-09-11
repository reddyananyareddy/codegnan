//23-08-2025
//2.Maximum of three integers

package com.codegnan.fundamentals;
import java.util.Scanner;
public class day_4_2_max_of_three {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		//warning in 8th line because scanner class is not closed scanner.close();
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
		if(a>=b&&a>=c)
			System.out.print(a);
		else if(b>=c&&b>=a)
			System.out.print(b);
		else
			System.out.print(c);
	}

}