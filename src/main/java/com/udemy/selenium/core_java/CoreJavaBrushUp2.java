package com.udemy.selenium.core_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// arrayList
		/***************************************************/
		ArrayList<String> a = new ArrayList();
		a.add("selenium");
		a.add("testng");
		a.add("java");
		
		System.out.println(a.get(1));
		
		for(int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
		
		for(String s:a) {
			System.out.println(s);
		}
		
		//convert Array to ArrayList
		String[] arr4 = {"Apfel", "Zitrone", "Melone", "Pflaume"};
		List<String> obst = Arrays.asList(arr4);
		System.out.println(obst.contains("Melone"));
	}
}
