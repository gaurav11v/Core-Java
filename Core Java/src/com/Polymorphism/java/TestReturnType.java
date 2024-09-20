package com.Polymorphism.java;

public class TestReturnType {
	public static void main(String[] args) {
		ShapeByReturn s1 = ShapeByReturn.getShapeByReturn(1);
		ShapeByReturn s2 = ShapeByReturn.getShapeByReturn(2);
		ShapeByReturn s3 = ShapeByReturn.getShapeByReturn(3);
		
		System.out.println( "Area of Rectangle : "+s1.area());
		System.out.println( "Area of Circle : "+s2.area());
		System.out.println( "Area of Triangle : "+s3.area());

	}

}
