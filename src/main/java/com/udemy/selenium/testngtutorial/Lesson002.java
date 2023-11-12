package com.udemy.selenium.testngtutorial;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Lesson002 {

	@Parameters({"URL","APIKey"})
	@Test
	public void paramDemo001(String URL, String key) {
		System.out.println("Go to " + URL);
		System.out.println("Enter valide login data " + key);
	}

	@Parameters("URL")
	@Test
	public void paramDemo0011(String URL) {
		System.out.println("Go to " + URL);
		System.out.println("Enter invalide login data");
		Assert.assertTrue(false);
	}

	@Parameters("URL")
	@Test
	public void paramDemo0012(String URL) {
		System.out.println("Go to " + URL);
		System.out.println("Login into Gmail Account");
	}

}
