package com.udemy.selenium.core_java;

public class NestedForLoopsDemo {

	public static void main(String[] args) {
		// nested loop
//		for (int i = 1; i < 4; i++) { // outer for loop
//
//			System.out.println("outer for loop started");
//
//			for (int j = 1; j < 4; j++) { // inner for loop
//				System.out.println("inner for loop " + j);
//			}
//
//			System.out.println("outer for loop finished");
//		}

		// assignment
//		int k= 1;
//		for (int j = 0; j < 4; j++) {
//			//System.out.println("outer loop started");
//			for (int i = 1; i <= 4-j; i++) {
//				System.out.print(k);
//				System.out.print("\t");
//				k++;
//			}
//			//System.out.print("outer loop finished");
//			System.out.print("\n");
//		}

		// assignment
//		int n= 1;
//		for (int j = 1; j < 5; j++) {
//			//System.out.println("outer loop started");
//			for (int i = 1; i <= j; i++) {
//				System.out.print(n);
//				System.out.print("\t");
//				n++;
//			}
//			//System.out.print("outer loop finished");
//			System.out.print("\n");
//		}
//		

		int k = 3;
		for (int j = 1; j < 5; j++) {
			// System.out.println("outer loop started");
			for (int i = 1; i <= j; i++) {
				System.out.print(k);
				System.out.print("\t");
				k = k + 3;
			}
			// System.out.print("outer loop finished");
			System.out.print("\n");
		}

	}

}
