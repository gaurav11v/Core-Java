package in.co.oop;

import java.util.Scanner;

public class FindAgeTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Current Year : ");
		int currentyear = sc.nextInt();
		
		System.out.println("Enter Your Birth Year : "); 
		int birthyear = sc.nextInt();
		int age = currentyear - birthyear;
		
		System.out.println("Your age is :" +age );
	}
	

}
