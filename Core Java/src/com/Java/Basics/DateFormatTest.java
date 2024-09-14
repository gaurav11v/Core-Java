package com.Java.Basics;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatTest {
	
	public static void main(String[] args) throws Exception {
	
		Date d = new Date();
		
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		
		String str = format.format(d);
		
		System.out.println(str);
		
		String str1 = "03/10/2000"; 
		
		Date d1 = format.parse(str1);
		
		System.out.println(d1);

	}

}
