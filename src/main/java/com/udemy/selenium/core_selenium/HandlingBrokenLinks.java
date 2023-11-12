package com.udemy.selenium.core_selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class HandlingBrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		/************************** MyCode ***************************/
//		WebElement footer = driver.findElement(By.id("gf-BIG"));
//
//		List<WebElement> listOfLinks = footer.findElements(By.cssSelector("li[class='gf-li'] a[href*='http']"));
//
//		for (WebElement link : listOfLinks) {
//
//			String url = link.getAttribute("href");
//			// System.out.println(url);
//
//			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
//			conn.setRequestMethod("HEAD");
//			conn.connect();
//
//			int responseCode = conn.getResponseCode();
//			System.out.println("Response code of " + link.getText() + ": " + responseCode);
//		}
		/************************** Code 1 ***************************/
//		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
//
//		for (WebElement link : links) {
//
//			String url = link.getAttribute("href");
//
//			HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
//
//			connection.setRequestMethod("HEAD");
//
//			connection.connect();
//
//			int responseCode = connection.getResponseCode();
//
//			System.out.println("Link " + link.getText() + " returns code: " + responseCode);
//
//			if (responseCode > 400) {
//				System.out.println("Link " + link.getText() + " is broken with code: " + responseCode);
//				Assert.assertTrue(false);
//			}
//
//			connection.disconnect();
//		}

		/************************** Code 2 ***************************/
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));

		SoftAssert soft = new SoftAssert();

		for (WebElement link : links) {

			String url = link.getAttribute("href");

			HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();

			connection.setRequestMethod("HEAD");
			
			connection.connect();

			int responseCode = connection.getResponseCode();

			System.out.println("Link " + link.getText() + " returns code: " + responseCode);

			// hard assert
			// Assert.assertTrue(responseCode < 400, "Link " + link.getText() + " is broken
			// with code: " + responseCode);

			// soft assert
			soft.assertTrue(responseCode < 400, "Link " + link.getText() + " is broken with code: " + responseCode);

			connection.disconnect();
		}

		driver.quit();

		soft.assertAll();

	}

}
