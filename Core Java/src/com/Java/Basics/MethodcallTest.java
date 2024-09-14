package com.Java.Basics;

public class MethodcallTest {
	public void div() {
		int a=20;
		int b=5;
		System.out.println(a/b);
	}
public static void main(String[] args) {
	MethodcallTest m = new MethodcallTest();       // syntax - Classname variable = new Classname();
	m.div();                                       // variable.methodname();
}
}
