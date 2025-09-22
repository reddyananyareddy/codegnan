//22-09-2025
package com.codegnan.oop.overloading;

import java.util.Scanner;

public class Cal_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.print("Enter first number: ");
        int a = sc.nextInt();
        //System.out.print("Enter second number: ");
        int b = sc.nextInt();

        My_Calculation calc = new My_Calculation(a,b);

        System.out.println(calc.addition());
        System.out.println(calc.multiplication());

        sc.close();
    }
}
