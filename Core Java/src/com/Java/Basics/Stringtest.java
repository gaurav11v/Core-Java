package com.Java.Basics;

public class Stringtest {
public static void main(String[] args) {
	String name = ("Gaurav Verma");
	System.out.println(name);
	
System.out.println("Length of the name = " +name.length()); // Space is also counted

System.out.println("8th char is " +name.charAt(7));     // Always put one lesser value than required

System.out.println("Ver index is -" +name.indexOf("Ver"));

System.out.println("First a position - " +name.indexOf("a"));

System.out.println("Last a position - " +name.lastIndexOf("a"));

System.out.println("a is replaced by o - " +name.replace("a","o"));

System.out.println("Chhota Gaurav Verma - "+name.toLowerCase());

System.out.println("Bada gaurav verma - "+name.toUpperCase());

System.out.println("Starts with Gau - " +name.startsWith("Gau"));

System.out.println("Ends with rma - " +name.endsWith("rma"));

System.out.println("Substring - " +name.substring(4));

}
}
