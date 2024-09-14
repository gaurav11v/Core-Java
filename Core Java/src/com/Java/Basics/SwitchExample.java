package com.Java.Basics;

import java.util.Scanner;

public class SwitchExample {
	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the number (1-7): ");
			int number = scanner.nextInt();
	String day;
	switch (number) {
	case 1:
		day = "Sunday";
	    break;
	case 2:
		day = "Monday";
		break;
	case 3:
		day = "Tuesday";
		break;
	case 4:
		day = "Wednesday";
		break;
	case 5:
		day = "Thursday";
		break;
	case 6:
		day = "Friday";
		break;
	case 7:
		day = "Saturday";
	default :
		day = "Invalid Day";
		break;
	} 	
		System.out.println("The day is " +day);
		
		scanner.close();
	
		
	}
}
