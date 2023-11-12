package com.udemy.selenium.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AssignmentStreams {

	public static void main(String[] args) {
		
		List<Integer> values  = Arrays.asList(3,2,2,7,5,1,9,7);
		//print unique numbers from array
		//sort array and give 3d index
		//values.stream().distinct().forEach(s -> System.out.println(s));
		
		List<Integer> sorted = values.stream().sorted().distinct().sorted().collect(Collectors.toList());
		
		System.out.println(sorted.get(2));

	}

}
