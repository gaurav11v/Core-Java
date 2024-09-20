package com.Polymorphism.java;

public class TestPolyArray {
	public static void main(String[] args) {
		ShapeByArray [] s = new ShapeByArray[3];
		
		s[0] = new RectangleAR(10,20);
		s[1] = new CircleAR(20);
		s[2] = new TriangleAR(50,20);
		
		double totalArea = calArea(s);
		System.out.println("Total Area = "+totalArea);
		}
	private static double calArea(ShapeByArray[] s) {
		double totalArea = 0;
		for(int i=0; i<s.length; i++) {
			totalArea += s[i].area();
			}
		return totalArea;
	}

}
