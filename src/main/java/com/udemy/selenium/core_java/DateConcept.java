package com.udemy.selenium.core_java;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("Edd.MM.yyyy HH:mm:ss");
		
		String currentDate = sdf.format(d);
		
		System.out.println(currentDate);

	}

}
