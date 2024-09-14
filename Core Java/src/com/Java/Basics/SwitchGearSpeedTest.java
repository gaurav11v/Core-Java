package com.Java.Basics;

import java.util.Scanner;

public class SwitchGearSpeedTest {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the Gear of a Car (0-5) = ");
	int number = sc.nextInt();
	String speed;
	
	switch (number) {
	case 0:
		speed = "Reverse";
		break;
	case 1:
		speed = "0-10 kmph";
		break;
	case 2:
	    speed = "10-20 kmph";
	    break;
	case 3:
		speed = "20-40 kmph";
		break;
	case 4:
		speed = "40-60 kmph";
		break;
	case 5:
		speed = "60-100 kmph";
		break;
		
	default :
	    speed = "Invalid Gear";
	    break;
	   
	}
	
		System.out.println("The speed of a car is " +speed);
		sc.close();
	}
	
}