package com.Polymorphism.java;

public class TriangleAR extends ShapeByArray {
private int base;
private int height;

public TriangleAR(int base, int height) {
	this.base = base;
	this.height = height;
	}
public double area() {
	return 0.5*base*height;
}
}
