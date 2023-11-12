package com.udemy.selenium.core_java;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ParentClass {

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Method runs before other method");
	}
	
	public void doThis() {
		System.out.println("Method from the parent class");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Method runs after other method");
	}
}
