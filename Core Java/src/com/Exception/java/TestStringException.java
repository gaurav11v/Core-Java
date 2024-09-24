package com.Exception.java;

public class TestStringException {
public static void main(String[] args) {
	String name = null;
	
	try {
		System.out.println(name.charAt(1));
	
	} catch (Exception e) {
		System.out.println("String is empty");
	}
}
}
