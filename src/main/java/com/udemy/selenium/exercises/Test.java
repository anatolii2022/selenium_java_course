package com.udemy.selenium.exercises;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String expectedCountry = "Germany";

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// enter first letter of country
		action.click(driver.findElement(By.id("autocomplete"))).sendKeys("ger").build().perform();

		// move cursor to desired country in the dropdown list
		List<WebElement> results = driver.findElements(By.cssSelector("li.ui-menu-item"));

		for (WebElement country : results) {

			if (country.getText().equalsIgnoreCase(expectedCountry)) {
				action.moveToElement(country).click().build().perform();
				break;
			}

		}

		String currentCountry = js.executeScript("return arguments[0].value", driver.findElement(By.id("autocomplete")))
				.toString();
		
		// simple version !!!
		System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));

		// verify that the wished country displayed in the input
		if (currentCountry.contentEquals(expectedCountry)) {
			Assert.assertTrue(true);
			System.out.println("Country is chosen correct: " + currentCountry);
		} else {
			Assert.assertFalse(false);
			System.out.println("Country is chosen wrong: " + currentCountry);

		}

		Thread.sleep(3000L);

		driver.quit();

	}

}
