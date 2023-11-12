package com.udemy.selenium.testngtutorial;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Lesson001 {

	@Test
	public void demo() {
		System.out.println("Hello world!");
	}
	
	@Test
	public void demo2() {
		System.out.println("Bye bye");
	}
	
	@AfterSuite
	public void tearDownSuite() {
		System.out.println("Execute afte all test folders");
	}
	
	@AfterTest
	public void tearDown() {
		System.out.println("Execute after all tests in test folder");
	}
}
