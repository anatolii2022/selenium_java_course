package com.udemy.selenium.core_java;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {
		// HashSet, LinkedHashSet, TreeSet implements Set interface
		HashSet<String> set  =new HashSet<String>();
		set.add("India");
		set.add("Canada");
		set.add("Germany");
		set.add("USA");
		System.out.println(set);
		
		//Iterator interface
		Iterator<String> iterator = set.iterator();
//		String result = iterator.next();
//		System.out.println(result);
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		

	}

}
