package com.Tasks.basics.java;

import java.util.Scanner;

public class Findmaxtwo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first no - ");
		
		int N1 = sc.nextInt();
		
		System.out.println("Enter Second no - ");
		
		int N2 = sc.nextInt();
		
		int max = (N1>N2)? N1 : N2;
		
		System.out.println("Max no. is - " + max);
		
	}
}