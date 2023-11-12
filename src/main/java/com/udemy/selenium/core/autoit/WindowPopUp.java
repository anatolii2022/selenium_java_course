package com.udemy.selenium.core.autoit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/");
		Thread.sleep(3000L);
		driver.findElement(By.linkText("Basic Auth")).click();
		Thread.sleep(3000L);
		driver.quit();
	}

}
