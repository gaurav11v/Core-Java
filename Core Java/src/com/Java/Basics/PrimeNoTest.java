package com.Java.Basics;
                                 // Prime no is divible by 1 or its own num.
import java.util.Scanner;

public class PrimeNoTest {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number to Check :");
	int a = sc.nextInt();
	int count = 0;
	
	if (a>1) {
		for (int i=1; i<=a;i++) {
			if(a%i==0)
				count++;
			}
		if (count==2) 
		{
		System.out.println(a+" is a Prime no.");
		}
	} 
	else {
		System.out.println(a+" isn't a Prime no.");
	}
	Scanner close;
	

}
	
}
