package com.udemy.selenium.exercises;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		String[] itemsToBuy = { "iphone X", "Samsung Note 8", "Nokia Edge", "Blackberry" };

		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");

		driver.findElement(By.cssSelector("input[value='user']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));

		driver.findElement(By.id("okayBtn")).click();

		WebElement options = driver.findElement(By.cssSelector("select.form-control"));

		Select dropdown = new Select(options);

		dropdown.selectByValue("consult");

		driver.findElement(By.id("terms")).click();

		driver.findElement(By.id("signInBtn")).click();

		wait.until(ExpectedConditions.titleIs("ProtoCommerce"));

		List<WebElement> items = driver.findElements(By.cssSelector("h4.card-title"));

		int j = 0;

		for (int i = 0; i < items.size(); i++) {

			String itemName = items.get(i).getText();

			List<String> itemsToBuyConverted = Arrays.asList(itemsToBuy);

			if (itemsToBuyConverted.contains(itemName)) {

				j++;

				driver.findElements(By.cssSelector("div.card-footer button")).get(i).click();
			}

			if (j == itemsToBuy.length)
				break;

		}

		driver.findElement(By.cssSelector("div#navbarResponsive a")).click();

		Thread.sleep(2000);

		driver.quit();
	}

}
