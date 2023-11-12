package com.udemy.selenium.exercises;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2e {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		/****************************** Step 001 ********************************/
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();

		Thread.sleep(2000L);

		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']"))
				.click();

		Thread.sleep(2000L);

		/****************************** Step 002 ********************************/
		driver.findElement(By.cssSelector(".ui-state-highlight")).click();

		Thread.sleep(2000L);
		/****************************** Step 003 ********************************/
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			System.out.println("Its disabled");
			Assert.assertTrue(true);
		} else {
			System.out.println("Its enabled");
			Assert.assertTrue(false);
		}
		/****************************** Step 004 ********************************/
		driver.findElement(By.id("divpaxinfo")).click();
		for (int j = 1; j < 5; j++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}

		driver.findElement(By.id("btnclosepaxoption")).click();

		Thread.sleep(2000L);
		/****************************** Step 005 ********************************/
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

		Select dropdown = new Select(staticDropdown);

		dropdown.selectByVisibleText("USD");
		/****************************** Step 006 ********************************/
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();

		/****************************** Step 007 ********************************/
		driver.findElement(By.cssSelector("input[value='Search']")).click();

		Thread.sleep(3000L);
		driver.quit();

	}
}
