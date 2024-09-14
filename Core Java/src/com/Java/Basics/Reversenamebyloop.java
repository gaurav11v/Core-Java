package com.Java.Basics;

public class Reversenamebyloop {
	public static void main(String[] args) {
		String name = "Gaurav";
	for(int i=name.length()-1; i>=0; i--)
			System.out.println(name.charAt(i));
	}
}
