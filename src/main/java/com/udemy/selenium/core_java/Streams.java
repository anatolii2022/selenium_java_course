package com.udemy.selenium.core_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class Streams {

	public static void main(String[] args) {

		Streams streams = new Streams();

		// streams.regular();
		// streams.streamFilter();
		//streams.streamMap();
		streams.streamCollect();

	}

	/*******************************************
	 * 
	 * Stream = Source + intermediate operation + terminal operation
	 * 
	 * 
	 *************************************************/

	public void regular() {
		ArrayList<String> names = new ArrayList<String>();

		names.add("Pony");
		names.add("Megg");
		names.add("Tom");
		names.add("Jil");
		names.add("Frank");

		int count = 0;

		for (int i = 0; i < names.size(); i++) {
			String actualName = names.get(i);

			if (actualName.startsWith("F")) {
				count++;
			}
		}
		System.out.println(count);
	}

	public void streamFilter() {
		ArrayList<String> names = new ArrayList<String>();

		names.add("Tony");
		names.add("Megg");
		names.add("Tom");
		names.add("Jil");
		names.add("Frank");

		// there is no life for intermediate operation if there is no terminal operation
		long result = names.stream().filter(s -> s.startsWith("T")).count();

		System.out.println(result);

		long list = Stream.of("Chip", "Dale", "Duck", "Micky").filter(s -> s.startsWith("D")).count();

		System.out.println(list);

		// terminal operation will execute only if intermediate operation (filter)
		// returns true
		long listFalse = Stream.of("Array", "Atomic", "Bob").filter(m -> {
			m.startsWith("A");
			return false;
		}).count();

		System.out.println(listFalse);

		// print all the names of the list
		names.stream().filter(t -> t.length() > 2).forEach(t -> System.out.println(t));

		// print only first result
		names.stream().filter(t -> t.length() > 2).limit(1).forEach(t -> System.out.println(t));

	}

	public void streamMap() {

		ArrayList<String> names = new ArrayList<String>();

		names.add("Tony");
		names.add("Megg");
		names.add("Tom");
		names.add("Jil");
		names.add("Frank");

		// print names which have the last letter as 'e'with Uppercase
		// Stream.of("Chip", "Dale", "Duck", "Micky", "Chloe", "Melone").filter(s ->
		// s.endsWith("e")).map(s -> s.toUpperCase()).forEach(s ->
		// System.out.println(s));

		// print names which have first letter as 'D' with Uppercase and sorted

		List<String> lib = Arrays.asList("Chip", "Duck", "Dale", "Micky", "Chloe", "Melone", "Doonkan", "Donatelo",
				"Dittriech");

		// lib.stream().filter(s -> s.startsWith("D")).sorted().map(s ->
		// s.toUpperCase()).forEach(s -> System.out.println(s));

		// merging/concatenate two different lists and sort
		Stream<String> unsortedList = Stream.concat(names.stream(), lib.stream());

		Stream<String> sortedListe = unsortedList.sorted();

		boolean flag = sortedListe.anyMatch(s -> s.equalsIgnoreCase("Dale"));

		Assert.assertTrue(flag);

		System.out.println("Test success");

	}

	public void streamCollect() {

		List<String> newList = Stream.of("Chip", "Dale", "Duck", "Micky", "Chloe", "Melone").filter(s -> s.endsWith("e")).map(s -> s.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(newList);
	}

}
