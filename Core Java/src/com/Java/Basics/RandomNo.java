package com.Java.Basics;

import java.util.Random;

public class RandomNo {
	public static void main(String[] args) {
		Random num = new Random();
		int random_num = num.nextInt(100);
		System.out.println("Random number is : " +random_num);
	}

}
