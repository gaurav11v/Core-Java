package com.Abstract.java;

public class Reactangle extends Shape {
	 int length;
	 int width;
	 
	 public Reactangle(int length, int width) {
		
		 this.length = length;
		 this.width = width;
	 }

	@Override
	public double area() {
		double Area = length*width;
		System.out.println(Area);
		return Area;
	}
	 public static void main(String[] args) {
		
		 Reactangle r = new Reactangle(60,30);
				 r.area();
	}
	 

}
