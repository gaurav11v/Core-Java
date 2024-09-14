package com.Java.Basics;

public class ArgsDivisionTest {
	public static void main (String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		double div = (double) a/b;
		System.out.println("The answer is " +div);
	}

}
