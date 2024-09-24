package com.Exception.java;

public class TestStringLength {
public static void main(String[] args) {
	String name = "Gaurav";
		try {
			System.out.println(name.charAt(7));
		} catch (StringIndexOutOfBoundsException e) {
		System.out.println("Size of string is 6 only");
		}	
}
}
