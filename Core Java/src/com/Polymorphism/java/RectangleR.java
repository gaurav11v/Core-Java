package com.Polymorphism.java;

public class RectangleR extends ShapeByReturn {
	double length;
	double width;

	public RectangleR (double length, double width) {
		this.length=length;
		this.width=width;
		}
	public double area() {
		return length*width;
	}

}
