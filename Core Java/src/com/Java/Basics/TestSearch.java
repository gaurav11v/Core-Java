package com.Java.Basics;

public class TestSearch {
	public static int Search(int[] numbers, int key) {
		for (int i=0; i<numbers.length; i++) {
			if (numbers [i]==key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int [] numbers = {1,2,3,4,5,6,7,8,9};
		int key = 2;
		int index = Search (numbers,key);
		
		if (index==-1) {
			
		System.out.println("Key is not found at index : " +key);
		}
		else {
			System.out.println("Key is found at index : " +key);
		}
	}
}
