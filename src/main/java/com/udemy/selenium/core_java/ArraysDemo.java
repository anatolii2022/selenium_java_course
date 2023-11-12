package com.udemy.selenium.core_java;

public class ArraysDemo {

	public static void main(String[] args) {
		//single variable
		int a = 4; 
		//  array - container which stores multiple values of the same data type
		int[] b = new int[5];
		b[0]=3;
		b[1]=7;
		b[2]=5;
		b[3]=35;
		b[4]=15;
		for(int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		int[] k= {45,67,90,1,4};
		
		System.out.println();
	 
	}
}
