package com.Java.Basics;
import java.time.LocalDateTime;
    public class TestTimeDate {
	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();
		
		System.out.println("Year : " +now.getYear());
		System.out.println("Month : "+ now.getDayOfMonth());
		System.out.println("Date : "+ now.toLocalDate());
		System.out.println("Day : "+ now.getDayOfWeek());
		System.out.println("Hour : "+now.getHour());
		System.out.println("Time : "+now.getMinute());
	}

}
