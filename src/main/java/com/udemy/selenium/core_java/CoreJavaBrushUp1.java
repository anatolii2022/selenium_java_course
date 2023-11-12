package com.udemy.selenium.core_java;

public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// arrays, if and for loop
		/***************************************************/
		int[] arr1 = new int[5];

		arr1[0] = 10;
		arr1[1] = 3;
		arr1[2] = 5;
		
		System.out.println("Array 1 consists: " + arr1[1]);
		/***************************************************/
		int[] arr2 = {34,14,45,6,7,8,3,23,22,201};
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.println("Array 2 consists: " + arr2[i]);
		}
		/***************************************************/
		String[] arr3 = new String[5];
		arr3[0] = "Auto";
		arr3[1] = "Fahrrad";
		arr3[2] = "Bus";
		
		System.out.println("Array 3 consists: " + arr3[1]);
		/***************************************************/
		String[] arr4 = {"Apfel", "Zitrone", "Melone", "Pflaume"};
		
		for(String s:arr4) {
			System.out.println("Array 4 consists: " + s);
		}
		
		/***************************************************/
		int[] arr5 = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i = 0; i < arr5.length; i++) {
			if(arr5[i] % 2 == 0) {
				System.out.println(arr5[i] + "is multiple of 2");
				break;
			} else {
				System.out.println(arr5[i] + "is not multiple of 2");
			}
		}
		
	}

}
