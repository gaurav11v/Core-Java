package com.Polymorphism.java;

public class CircleA extends ShapeByArgument{
	public double radius;
	public final double pi = 3.14;
	
	public CircleA (double radius) {
		this.radius = radius;
	}
	public double area() {
		return pi*radius*radius;
	}

}
