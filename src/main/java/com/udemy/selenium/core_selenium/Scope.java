package com.udemy.selenium.core_selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		/*******************************************************************/
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
		System.out.println(columnDriver.findElements(By.tagName("a")).size());
		
		
		for(int i = 1; i < columnDriver.findElements(By.tagName("a")).size(); i++) {
			
			String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
			
			Thread.sleep(5000L);
		}
		
		/*******************************************************************/
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> listOfWindows = windows.iterator();
		
//		String parentWindow = listOfWindows.next();
//		
//		for(int i = 0; i< windows.size()-1; i++) {
//		
//			String childWindow = listOfWindows.next();
//			
//			driver.switchTo().window(childWindow);
//			
//			Thread.sleep(3000L);
//			
//			System.out.println(driver.getTitle().toString());
//		}	
		
		/*******************************************************************/
		while(listOfWindows.hasNext()) {
			
			driver.switchTo().window(listOfWindows.next());
			
			Thread.sleep(3000L);
			
			System.out.println(driver.getTitle());
			
		}
		
		/*******************************************************************/
		driver.quit();
	}
}
