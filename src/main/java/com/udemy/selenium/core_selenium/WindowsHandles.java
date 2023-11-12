package com.udemy.selenium.core_selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandles {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.cssSelector("a[class='blinkingText']")).click();
		
		Thread.sleep(2000L);
		
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> windowsSet = windows.iterator(); //[parentwindows,childwindow]
		
		String parentWindow = windowsSet.next();
		
		String childWindow = windowsSet.next();
		
		driver.switchTo().window(childWindow);
		
		String emailId = driver.findElement(By.cssSelector("p.im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		
		driver.switchTo().window(parentWindow);
		
		Thread.sleep(2000L);
		
		driver.findElement(By.id("username")).sendKeys(emailId);
		
		Thread.sleep(2000L);
		
		driver.quit();
	}

}
