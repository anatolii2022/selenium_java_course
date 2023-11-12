package com.udemy.selenium.core_java;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// List interface - ArrayList, LinkedList, Vector
		ArrayList<String> l = new ArrayList<String>();
		l.add("java");
		l.add("python");
		l.add("c++");
		System.out.println(l);
		l.add(0, "javascript");
		System.out.println(l);
		l.remove(2);
		System.out.println(l);
		System.out.println(l.contains("test"));
	 

		


	}

}
