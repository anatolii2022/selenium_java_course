package com.udemy.selenium.testngtutorial;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Lesson0013 {

	@BeforeMethod
	public void setUpClass() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void tearClass() {
		System.out.println("After Method");
	}
	
	@Test(groups = "Smoke")
	public void webLoginHomeLoan() {
	
		System.out.println("WebLoginHome");
	}
	
	@Test(groups = "Smoke")
	public void mobileLoginHomeLoan() {
		
		System.out.println("MobileLoginHome");
	}
	
	@Test(dependsOnMethods = "webLoginHomeLoan")
	public void APILoginHomeLoan() {
		
		System.out.println("APILoginHome");
	}
}
