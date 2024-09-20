package com.Polymorphism.java;

public class TriangleR extends ShapeByReturn {
	private int base;
	private int height;

	public TriangleR(int base, int height) {
		this.base = base;
		this.height = height;
	}
	public double area() {
		return 0.5*base*height;
	}

}
