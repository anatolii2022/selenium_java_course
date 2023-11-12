package com.udemy.selenium.core_selenium;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//driver.switchTo().newWindow(WindowType.TAB).get("https://rahulshettyacademy.com/");
		
		//open new Window
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://rahulshettyacademy.com/");
		
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> windwosId = windows.iterator();
		
		String parentWindow = windwosId.next();
		
		String childWindow = windwosId.next();
		
		driver.switchTo().window(childWindow);
		
		String titleOfCousre = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p'] ")).get(1).getText();
		
		driver.switchTo().window(parentWindow);
		
		WebElement name = driver.findElement(By.name("name"));
		
		name.sendKeys(titleOfCousre);
		
		//taking a screenshot of an element
		File src = name.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File("D:\\01_software_development\\03_Workspaces\\02_eclipse-workspace\\selenium_java\\screenshots\\element.png"));
		
		
		//get width and height of element
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());
		
		Thread.sleep(3000L);
		
		driver.quit();

	}

}
