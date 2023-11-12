package com.udemy.selenium.exercises;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTabelsAssignment {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		js.executeScript("window.scrollBy(0,400)");

		// 1. print number of rows in table 11

		//System.out.println("Number of Rows: " + driver.findElements(By.xpath("//table[@name='courses']//tr")).size());
		
		WebElement table = driver.findElement(By.xpath("//table[@id='product'][1]"));
		
		System.out.println(table.findElements(By.tagName("tr")).size());

		// 2. print number of columns 3 in table
		//System.out.println("Number of Columns: " + driver.findElements(By.xpath("//table[@name='courses']//tr/th")).size());
		
		System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());

		// 3. print content of 2nd row
		//System.out.println(driver.findElement(By.xpath("//table[@name='courses']//tr[3]")).getText());
		
		List<WebElement> secondRow = table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		
		System.out.println(secondRow.get(0).getText());
		System.out.println(secondRow.get(1).getText());
		System.out.println(secondRow.get(2).getText());

		// 3. print content of 2nd row
		List<WebElement> rows = driver.findElements(By.xpath("//table[@name='courses']//tr"));

		int count = driver.findElements(By.xpath("//table[@name='courses']//tr")).size();

		for (int i = 1; i < count; i++) {

			String rowData = rows.get(i).getText();

			if (rowData.contains("Rahul Shetty Learn SQL in Practical + Database Testing from Scratch 25")) {
				System.out.println("Content od second row: " + rows.get(i).getText());
			}
		}

		Thread.sleep(3000L);

		driver.quit();

	}

}
