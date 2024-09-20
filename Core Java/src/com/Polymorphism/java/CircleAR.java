package com.Polymorphism.java;

public class CircleAR extends ShapeByArray {
	private int radius;
	public static final double pi = 3.14;
	
	public CircleAR(int radius) {
		this.radius = radius;
	}
	public double area() {
		return pi*radius*radius;
	}

}
