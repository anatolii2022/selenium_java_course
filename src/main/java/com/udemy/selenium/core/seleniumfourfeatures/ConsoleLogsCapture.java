package com.udemy.selenium.core.seleniumfourfeatures;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

public class ConsoleLogsCapture {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.linkText("Browse Products")).click();
		driver.findElement(By.partialLinkText("Selenium")).click();
		driver.findElement(By.cssSelector(".add-to-cart")).click();
		driver.findElement(By.linkText("Cart")).click();
		driver.findElement(By.id("exampleInputEmail1")).clear();
		driver.findElement(By.id("exampleInputEmail1")).sendKeys("2");
		
		LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER); // LogEntries object store logs of browser
		List <LogEntry> logs = logEntries.getAll(); // getAll method returns all logs
		for(LogEntry e : logs) {
			System.out.println(e.getMessage()); // extract this messages to log4j2
		}
		
		Thread.sleep(3000L);
		driver.quit();

	}

}
