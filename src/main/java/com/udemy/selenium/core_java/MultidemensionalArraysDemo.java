package com.udemy.selenium.core_java;

public class MultidemensionalArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// x - row y - column
		int[][] a = new int[3][3]; // 2 - rows and 3 - columns
		a[0][0] = 2;
		a[0][1] = 4;
		a[0][2] = 5;
		a[1][0] = 3;
		a[1][1] = 4;
		a[1][2] = 7;
		a[2][0] = 8;
		a[2][1] = 1;
		a[2][2] = 9;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println("");
		}

	}

}
