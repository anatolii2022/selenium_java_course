package com.udemy.selenium.core_java;

public class WhileDemo {

	public static void main(String[] args) {
		// while loop
		int i = 1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("***************************************************");
		
		int j = 10;
		while(j>0) {
			System.out.println(j);
			j--;
		}
		
		System.out.println("***************************************************");
		
		// do while loop
		int k = 20;
		do {
			System.out.println(k);  // 1 loop of execution is guarantee in do while loop
			k++;
		} while(k <= 30);
		

	}

}
