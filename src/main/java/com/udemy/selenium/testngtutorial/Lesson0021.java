package com.udemy.selenium.testngtutorial;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Lesson0021 {

	@Parameters("searchText")
	@Test
	public void paramDemo002(String text) {
		System.out.println("Navigate to Amazone.com");
		System.out.println("Enter " + text);
	}

	@Parameters("searchText")
	@Test
	public void paramDemo0021(String text) {
		System.out.println("Navigate to OTTO.com");
		System.out.println("Enter " + text);
	}

	@Parameters("searchText")
	@Test
	public void paramDemo0022(String text) {
		System.out.println("Navigate to Cyberport.de");
		System.out.println("Enter" + text);
	}

}
