package com.udemy.selenium.core_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocators {

	public static void main(String[] args) throws InterruptedException {
		 
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");

		WebElement editBox = driver.findElement(By.cssSelector("[name='name']"));
		
		String labelText =  driver.findElement(RelativeLocator.with(By.tagName("label")).above(editBox)).getText();
		
		System.out.println(labelText);
		
		By label = RelativeLocator.with(By.tagName("label")).above(editBox);
		
		System.out.println(driver.findElement(label).getText());
		
		WebElement dateOfBirth = driver.findElement(By.cssSelector("[for='dateofBirth']"));
		
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(dateOfBirth)).click();
		
		Thread.sleep(3000L);
		
		driver.quit();
	

	}

}
