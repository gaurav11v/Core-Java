package com.Exception.java;

public class TestArithmeticException {
	public static void main(String[] args) {
		int i = 10;
		 int a = 0;
		 
		 try {
			 int c = i/a;
			 System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("Your no. is not divisible by zero.");
			
			//System.out.println(e.getClass());
		//e.printStackTrace();
		}
		
	}
	
}
