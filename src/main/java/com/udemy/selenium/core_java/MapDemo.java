package com.udemy.selenium.core_java;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// Map interface implements by HashMap, Hashtable
		// null keys or values are allowed
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(0, "hello");
		map.put(1, "java");
		map.put(2, "python");
		
		for(int i = 0; i < map.size(); i++) {
			System.out.println(map.get(i));
		}
		
		Set setInteger = map.entrySet();
		Iterator iterator = setInteger.iterator();
		
		while(iterator.hasNext()) {
			Map.Entry mapp = (Map.Entry)iterator.next();
			System.out.println(mapp.getKey());
			System.out.println(mapp.getValue());
			//System.out.println(mapp);
		}
		
		// Hashtable is thread safe and synchronized
		// null keys or values are not allowed
		// to iterate through the table enumerator is required
		Hashtable<String, String> table = new Hashtable<String, String>();
		table.put("", "");
		
		
		

	}

}
