package com.Java.Basics;

public class TestMethodCalculator {

	public static void main(String[] args) {
		
		MethodCalculator c = new MethodCalculator();
		c.sum(20, 50);
		c.div(50, 5);
		c.multiply(60, 30);
		c.sub(100, 40);
		
	}
}


// if static is there then it will be called with ClassName.methodname
// MethodCalculator.sum(20, 50);