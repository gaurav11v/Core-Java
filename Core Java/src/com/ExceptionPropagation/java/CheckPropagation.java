package com.ExceptionPropagation.java;

public class CheckPropagation {
	public static void main(String[] args) {
		try {
			dad();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void dad() throws Exception {
		mom();
	}

	public static void mom() throws Exception {
		son();

	}

	public static void son() throws Exception {
		throw new Exception("Propagation of Exception");
	}

}
