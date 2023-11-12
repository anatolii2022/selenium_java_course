package com.udemy.selenium.core_java;

public class CoreJavaBrushUp3 {
	public static void main(String[] args) {

		//String is an Object
		//String literal
		String s1 = "Selenium Framework";
		String s2 = "Selenium Framework";
		
		//String new
		String s3 = new String("Selenium Java Framework");
		String s4 = new String("Selenium Java Framework");
		String s = "Udemy  Online  Academy";
		
		String[] splittedString1 = s3.split(" ");
		System.out.println(splittedString1[0]);
		System.out.println(splittedString1[1]);
		System.out.println(splittedString1[2]);
		
		String[] splittedString2 = s.split("Online");
		System.out.println(splittedString2[0]);
		System.out.println(splittedString2[1]);
		System.out.println(splittedString2[1].trim());
		
		for(int i = 0; i < splittedString1.length; i++) {
			System.out.println(splittedString1[i]);
		}
		
		//reverse String
		for(int i = s.length()-1; i >= 0; i--) {
			System.out.println(s.charAt(i));
		}
	
		
		
	}

}
