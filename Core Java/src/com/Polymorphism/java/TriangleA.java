package com.Polymorphism.java;

public class TriangleA extends ShapeByArgument {
private int base;
private int height;

public TriangleA(int base, int height) {
	this.base = base;
	this.height = height;
}
public double area() {
	return 0.5*base*height;
}
}
