package com.Tasks.basics.java;

import java.util.Scanner;

public class ReverseGivenNo {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter no. to reverse. - ");
	int num = sc.nextInt();
	
	int Reversednum = 0;
	
	while (num != 0) {
		
		int digits = num%10;
		Reversednum = Reversednum*10 + digits;
		num/=10;
	
		
}
	System.out.println("Reverse no is " +Reversednum);

}

}