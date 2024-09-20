package com.Polymorphism.java;

public class PolyArgumentTest {
public static void main(String[] args) {
	
	ShapeByArgument s = new RectangleA(20,30);
	ShapeByArgument s1 = new CircleA(20);
	ShapeByArgument s2 = new TriangleA(30,40);
	
	System.out.println("Rectangle area :" + s.area());
	System.out.println("Circle area :" + s1.area());
	System.out.println("Triangle area :" + s2.area());
}
}
