package com.CustomException;

public class TestLogin {
public static void main(String[] args) throws LoginException {
	//String login = "zyx";
	String login = "xyz";
	if (login != "xyz") {
		
		throw new LoginException();
	}else {
		System.out.println("User login Successfully...");
	}
}
}
