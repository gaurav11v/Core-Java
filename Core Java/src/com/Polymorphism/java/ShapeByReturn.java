package com.Polymorphism.java;

public class ShapeByReturn {
	public ShapeByReturn() {
		}
public double area() {
	return 0;
	}
public static ShapeByReturn getShapeByReturn(int i) {
	if(i==1) {
		return new RectangleR(5,6);
	}
	if(i==2) {
		return new CircleR(5);
		}
	if(i==3) {
		return new TriangleR(12,15);
	}
	return new ShapeByReturn();
}

}
