package com.udemy.selenium.core_selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalendarUI {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		String dateToChoose = "14";

		String monthToChoose = "November";

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();

		driver.get("https://www.path2usa.com/travel-companion/");

		Thread.sleep(2000L);

		js.executeScript("[window.scrollBy(0,1200)]");

		Thread.sleep(2000L);

		driver.findElement(By.cssSelector("input#form-field-travel_comp_date")).click();

		/***************************************************************************/
		while (!driver.findElement(By.cssSelector("[class='flatpickr-month'] [class='flatpickr-current-month']")).getText().contains(monthToChoose)) {
			driver.findElement(By.cssSelector("[class='flatpickr-month'] [class='flatpickr-next-month']")).click();
		}

		/***************************************************************************/
		List<WebElement> dates = driver.findElements(By.className("flatpickr-day"));

		int count = driver.findElements(By.className("flatpickr-day")).size();

		for (int i = 0; i < count; i++) {

			String date = driver.findElements(By.className("flatpickr-day")).get(i).getText();

			if (date.equalsIgnoreCase(dateToChoose)) {
				driver.findElements(By.className("flatpickr-day")).get(i).click();
				break;
			}

		}

		Thread.sleep(3000L);

		driver.quit();

	}

}
