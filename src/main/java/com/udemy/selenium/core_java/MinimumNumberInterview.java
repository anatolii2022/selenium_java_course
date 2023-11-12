package com.udemy.selenium.core_java;

public class MinimumNumberInterview {

	public static void main(String[] args) {
		// minumum number
//		int[][] abc = { { 20, 4, 5 }, { 3, 4, 7 }, { 10, 20, 9 } };
//		int min = abc[0][0];
//		for (int i = 0; i < abc.length; i++) {
//
//			for (int j = 0; j < abc.length; j++) {
//				// System.out.println(abc[i][j]);
//				if (abc[i][j] < min) {
//					min = abc[i][j];
//				}
//			}
//		}
//		System.out.println("Min number is " + min);
//		
		// maximum number
//		int[][] numbers = { { 20, 4, 500 }, { 3, 4, 7 }, { 10, 20, 9 } };
//		int max = numbers[0][0];
//		for (int i = 0; i < numbers.length; i++) {
//
//			for (int j = 0; j < numbers.length; j++) {
//				// System.out.println(abc[i][j]);
//				if (numbers[i][j] > max) {
//					max = numbers[i][j];
//				}
//			}
//		}
//		System.out.println("Max number is " + max);
		
		/*
		 * 30, 7, 5
		 * 3,  4, 0
		 * 1, 20, 9
		 * 
		 * */

		int[][] abc = { { 30, 7, 5 }, { 3, 4, 0 }, { 1, 20, 9 } };
		int min = abc[0][0];
		int minColumn = 0;

		for (int i = 0; i < abc.length; i++) {

			for (int j = 0; j < abc.length; j++) {

				if (abc[i][j] < min) {
					min = abc[i][j];

					minColumn = j;

				}
			}
		}
		System.out.println("Min number is " + min);

		int max = abc[0][minColumn];
		int k = 0;

		while (k < 3) {
			if (abc[k][minColumn] > max) {
				max = abc[k][minColumn];
			}
			k++;

		}
		System.out.println("Max number is " + max);

	}
}
