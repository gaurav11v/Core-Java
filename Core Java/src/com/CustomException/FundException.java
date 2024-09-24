package com.CustomException;

public class FundException extends Exception {
	public FundException() {
		System.out.println("Insufficient Balance...Process denied");
	}

}
