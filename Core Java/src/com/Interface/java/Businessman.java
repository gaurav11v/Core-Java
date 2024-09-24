package com.Interface.java;

public class Businessman implements Richman, Socialworker {

	@Override
	public void helptoothers() {
		System.out.println("Help to others");
		
	}

	@Override
	public void earnmoney() {
System.out.println("Earning money");		
	}

	@Override
	public void donation() {
System.out.println("Donated Money");		
	}

	@Override
	public void party() {
		System.out.println("Doing Party");
		}
	
	public static void main(String[] args) {
		Businessman b = new Businessman();
		
		b.earnmoney();
		b.donation();
		b.helptoothers();
		b.party();
	}

}
