package com.udemy.selenium.testngtutorial;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Lesson0011 {
	
	@Test(groups="Smoke")
	public void demo3() {
		System.out.println("TesNG Framework");
	}
	
	@BeforeClass
	public void setUp() {
		System.out.println("Execute before Lesson0011 Class");
	}
	
	@AfterClass
	public void tesrDown() {
		System.out.println("Execute after Lesson0011 Class");
	}
	
	@BeforeTest
	public void setUpTest() {
		System.out.println("Execute before all tests in test folder");
	}

}
