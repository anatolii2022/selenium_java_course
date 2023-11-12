package com.udemy.selenium.core_java;


import java.text.SimpleDateFormat;
import java.util.Calendar;
 

public class CalendarConcept {

	public static void main(String[] args) {
		//  
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("M.d.yyyy");
		String currentDate = sdf.format(calendar.getTime());
		
		System.out.println(currentDate);
		
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(calendar.get(Calendar.AM_PM));
		

	}

}
