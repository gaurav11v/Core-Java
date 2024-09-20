package com.Tasks.basics.java;

public class SumofInt {
public static void main(String[] args) {
	int sum = 0;
	
	for(int i=100; i<=200;i++) {
		if(i%7==0) {
		sum+=i;
	}
	}
	System.out.println("Sum of the no. divible by 7 : " +sum);
}
}
