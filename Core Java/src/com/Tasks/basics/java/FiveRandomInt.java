package com.Tasks.basics.java;

import java.util.Random;

public class FiveRandomInt {
public static void main(String[] args) {
	Random Rno = new Random();
	
	System.out.println("5 Random integers are - ");
	for( int i=1; i<=5; i++) {
		
		int r = Rno.nextInt(100);
		System.out.println(r);
	}
	
}
}
