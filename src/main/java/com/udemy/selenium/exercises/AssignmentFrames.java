package com.udemy.selenium.exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentFrames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Nested Frames")).click();
		
		//System.out.println(driver.findElements(By.tagName("frame")).size());
		
		//driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-top']")));
		
		//System.out.println(driver.findElements(By.tagName("frame")).size());
		
		//driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-middle']")));
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-top']"))).switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-middle']")));
		
		System.out.println(driver.findElement(By.cssSelector("div#content")).getText());
		
		Thread.sleep(3000L);
		
		driver.quit();
	}

}
