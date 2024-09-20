package com.Polymorphism.java;

public class CircleR extends ShapeByReturn {
	public double radius;
	public final double pi = 3.14;
	
	public CircleR (double radius) {
		this.radius = radius;
	}
	public double area() {
		return pi*radius*radius;
	}

}
