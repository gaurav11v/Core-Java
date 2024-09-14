package com.Java.Basics;

public class SearchTestCuisine {
	public static int Search(String[] cuisines, String key) {
		for (int i=0; i<cuisines.length; i++) {
			if(cuisines[i]==key) {
				return i;
			}
		}
		return -1;
	}
public static void main(String[] args) {
	String [] cuisines = { "Samosa", "Chowmin", "Momos", "kachori", "Vadapav"};
	String key = "Samosa";
	
	
	int index = Search(cuisines,key);
	
	if(index==-1) 
	{
		System.out.println("Cuisine is not found at index : "+key);
	}
	else {
		System.out.println("Cuisine is found at index : "+key);
	}
}
}
