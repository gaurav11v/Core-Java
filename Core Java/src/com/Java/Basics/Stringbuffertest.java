package com.Java.Basics;

public class Stringbuffertest {
public static void main(String[] args) {
	StringBuffer sb = new StringBuffer("Gaurav ");
	sb.append("Verma");
	sb.append(" is student of");
	sb.append(" Rays.");
	System.out.println(sb);
	
	System.out.println();
	
	System.out.println("Capacity : "+sb.capacity());
	System.out.println(sb.charAt(5));
	System.out.println(sb.length());
	System.out.println(sb.indexOf("stud"));
	//System.out.println("Reverse : "+sb.reverse());
	System.out.println(sb.replace(2, 7, "hello"));
}
}
