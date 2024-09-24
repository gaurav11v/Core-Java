package com.Abstract.java;

public class Child extends Parent {

	@Override
	public void Loan() {
		System.out.println("Completed class");
	}

	public static void main(String[] args) {
		Child c = new Child();
		c.Loan();
	}

}
