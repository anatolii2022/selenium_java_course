package com.udemy.selenium.core_java;

public class ForDemo {

	public static void main(String[] args) {
		// for and if loops
		// 1 to 10

		/*
		 * for(initiation;condition;increment) {
		 * 
		 * }
		 */
		
		/*
		 * if(5>2) {
		 * 
		 * 
		 * System.out.println("success"); System.out.println("second step"); }
		 * 
		 * else
		 * 
		 * System.out.println("fail");
		 */

		for (int i = 0; i < 10; i = i + 3) {
			if (i == 9)
				System.out.println(" 9 is displayed");
			else
				System.out.println("I didnot find");//
		}

	}

}
