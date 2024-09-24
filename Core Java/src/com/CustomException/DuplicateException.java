package com.CustomException;

public class DuplicateException extends Exception {
	public DuplicateException() {
		System.out.println("User already exist...Try again");
	}

}
