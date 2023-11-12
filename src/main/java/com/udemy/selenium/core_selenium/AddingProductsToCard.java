package com.udemy.selenium.core_selenium;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddingProductsToCard {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5) );
		
		String[] product = { "Brocolli", "Cucumber", "Tomato" };

		// declare on global level (browser level) timeout
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		/***************************************************************/
		addItemsToCard(product, driver);

		/***************************************************************/

		driver.findElement(By.cssSelector("a.cart-icon")).click();
		driver.findElement(By.cssSelector("div.action-block button")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

		/***************************************************************/
		Thread.sleep(2000L);

		driver.quit();
	}

	public static void addItemsToCard(String[] product, WebDriver driver) {

		int j = 0;

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {

			String[] productName = products.get(i).getText().split("-");
			// format it to get actual vegetable name
			String formattedProductName = productName[0].trim();

			// convert array into array list for easy search
			List productList = Arrays.asList(product);

			if (productList.contains(formattedProductName)) {

				j++;

				// click on Add To Card
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == product.length) {
					break;
				}

			}
		}
	}

}
