package com.udemy.selenium.testngtutorial;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Lesson0012 {

	@Test
	public void webLoginCarLoan() {
	
		System.out.println("WebLoginCar");
	}
	
	@Test
	public void mobileLoginCarLoan() {
		
		System.out.println("MobileLoginCar");
	}
	@Test(timeOut = 4000)
	public void mobileSignInCarLoan() {
		
		System.out.println("MobileSignCar");
	}
	
	@Test
	public void APILoginCarLoan() {
		
		System.out.println("APILoginCar");
	}
	
	@BeforeSuite
	public void setUpSuite() {
		System.out.println("Execute before all test folders");
	}
	
}
