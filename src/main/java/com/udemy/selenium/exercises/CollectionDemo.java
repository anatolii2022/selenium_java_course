package com.udemy.selenium.exercises;

import java.util.ArrayList;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO print unique numbers from the list - Amazon
		int[] a = { 4, 5, 5, 5, 4, 6, 6, 9, 4 };

		// 4 repeated 3 time , 5 repeated 3 times, 6 - 2 time and 9 - 1

		// empty arrayList
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {

			int k = 0;

			if (!list.contains(a[i])) {
				list.add(a[i]);
				k++;

				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						k++;
					}
				}

				System.out.println(a[i] + " repeated: " + k);
				if(k==1) {
					System.out.println(a[i] + " is unique number");
				}
			}

		}

	}

}
