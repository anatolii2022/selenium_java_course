package com.udemy.selenium.core_selenium;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandlingTable {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> names = driver.findElements(By.xpath("//div[@class='tableFixHead']//tr/td[1]"));
		
		List<String> originalNames = names.stream().map(s -> s.getText()).collect(Collectors.toList());
		
		List<String> sortedNames = originalNames.stream().sorted().collect(Collectors.toList());
		
		System.out.println("Actual list: " + originalNames +  "\nExpected list: " + sortedNames );
		
		Assert.assertTrue(originalNames.equals(sortedNames));
		
		//Assert.assertEquals(originalNames, sortedNames);
		
		List<String> amount = names.stream().filter(s -> s.getText().contains("Ivory")).map(s -> getAmount(s)).collect(Collectors.toList());

		amount.stream().forEach(s-> System.out.println(s));
		
		driver.quit();
	}
	
	private static String getAmount(WebElement e) {
		
		return e.findElement(By.xpath("following-sibling :: td[3]")).getText(); 
		
	}

}
