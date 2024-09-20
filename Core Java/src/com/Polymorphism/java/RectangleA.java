package com.Polymorphism.java;

public class RectangleA extends ShapeByArgument {
double length;
double width;

public RectangleA (double length, double width) {
	this.length=length;
	this.width=width;
	}
public double area() {
	return length*width;
}
}
