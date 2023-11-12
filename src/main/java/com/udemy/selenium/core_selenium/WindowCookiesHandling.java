package com.udemy.selenium.core_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowCookiesHandling {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		//validate cookies 
		driver.manage().deleteCookieNamed("sessionKey");
		
		//click on any link to be redirected to the login page

	}

}
