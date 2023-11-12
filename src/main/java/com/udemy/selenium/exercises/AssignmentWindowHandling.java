package com.udemy.selenium.exercises;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentWindowHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/windows");

		driver.findElement(By.cssSelector("div.example a")).click();

		Set<String> windows = driver.getWindowHandles();

		Iterator<String> listOfWindows = windows.iterator();

		String parentWindows = listOfWindows.next();

		String childWindows = listOfWindows.next();

		driver.switchTo().window(childWindows);

		System.out.println(driver.findElement(By.cssSelector("div.example h3")).getText());

		driver.switchTo().window(parentWindows);

		System.out.println(driver.findElement(By.cssSelector("div.example h3")).getText());

		driver.quit();

	}

}
