package com.CustomException;

public class TestFundexception {
	public static void main(String[] args) throws FundException {
		int balance = 500;
		
		if (balance<500) {
			throw new FundException();
		}else {
			System.out.println("You can transfer fund");
		}
	}

}
