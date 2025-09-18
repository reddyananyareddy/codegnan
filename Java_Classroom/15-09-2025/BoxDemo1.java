//15-09-2025
package com.codegnan.oopexamples;

public class BoxDemo1 {
double height;
double width;
double depth;
 //method without parameters without return type
public void volume() {
	System.out.println("Volume is : ");
	System.out.println(height*width*depth);
}
//method without parameters with return type
public double vol() {
	return height*width*depth;
}
//method with parameters with return type
public double setDim(double height,double width,double depth) {
	return width*height*depth;
}
//method with parameters without return type
public void setDimension(double height,double width,double depth) {
	double volume=height*width*depth;
	System.out.println("Volume is: "+volume);
}

	public static void main(String[] args) {
		BoxDemo1 b1=new BoxDemo1();
		b1.height=2.0;
		b1.width=3.0;
		b1.depth=5.0;
		b1.volume();//1
		System.out.println("b1 volume: "+b1.vol());//2
		System.out.println("b1 volume: "+b1.setDim(4.0,6.0,2.0));//3
		b1.setDimension(-2.0,-3.0,4.0);//4
		
		
		BoxDemo1 b2=new BoxDemo1();
		b2.height=12.0;
		b2.width=3.0;
		b2.depth=2.0;
		b2.volume();
		System.out.println("b2 volume: "+b2.vol());

	}

}
