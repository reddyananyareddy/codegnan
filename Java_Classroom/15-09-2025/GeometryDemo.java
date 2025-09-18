//15-09-2025
package com.codegnan.oopexamples;

public class GeometryDemo {

	public static void main(String[] args) {
		Geometry shape=new Geometry();
		shape.base=10;
		shape.height=6;
		shape.sideA=5;
		shape.sideB=6;
		shape.sideC=7;
		shape.radius=7;
		//Instance Methods
		System.out.println("Instance Methods");
		//1.w r w p
		double rectArea=shape.calRectArea(12,5);
		System.out.println("Rectangle Area: "+rectArea);
		//2.wo r w p
		shape.printTrianglePerimeter(5,6,7);
		//3.wo r wo p
		shape.displayData();
		//4.w r wo p
		double triangleArea=shape.storedTriangleArea();
		System.out.println("Stored Triangle Area: "+triangleArea);
		
		//static methods
		System.out.println("Static Methods");
		//w r w p
		double circleArea=Geometry.calculateCircleArea(7);
		System.out.print("Circle Area: "+circleArea);
		// wo r w p
		Geometry.printCircleCircumference(7);
		//wo r wo p
		Geometry.printFixedTrapeziumArea();
		//w r wo p
		double fixedTriangleArea=Geometry.getFixedTriangleArea();
		System.out.println("Fixed Trianle Area: "+fixedTriangleArea);
	}

}
