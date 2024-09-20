package com.Polymorphism.java;

public class RectangleAR extends ShapeByArray {
private int length;
private int width;

	public RectangleAR (int length, int width) {
		this.length = length;
		this.width = width;
	}
	public double area() {
		return length*width;
	}
}
