package com.udemy.selenium.core_java;

public class MethodsDemo1 {

	public static void main(String[] args) {
		
		MethodsDemo1 m1 = new MethodsDemo1();
		MethodsDemo2 m2 = new MethodsDemo2();
		
		String s1 = m1.getData();
		System.out.println(s1);
		
		String s2 = getUserData();
		System.out.println(s2);
		
		String s3 = m2.getReport();
		System.out.println(s3);
		
		
	}
	
	public String getData() {
		System.out.println("Hello world!");
		return "Selenium Java Framework";
	}
	
	public static String getUserData() {
		System.out.println("Hello user");
		return "Udemy";
	}
}
