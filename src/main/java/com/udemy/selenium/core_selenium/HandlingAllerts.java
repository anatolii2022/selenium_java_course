package com.udemy.selenium.core_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAllerts {

	public static void main(String[] args) throws InterruptedException {
		String message = "Toli";
		
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		/*************************** Alert ***************************************/
		driver.findElement(By.cssSelector("input#name")).sendKeys(message);
		
		driver.findElement(By.cssSelector("input[value='Alert']")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000L);
		
		/*************************** Confirm ***************************************/
		driver.findElement(By.cssSelector("input#name")).sendKeys(message);
		
		driver.findElement(By.cssSelector("input[value='Confirm']")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(2000L);
		
		driver.quit();
	}

}
