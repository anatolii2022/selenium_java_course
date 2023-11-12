package com.udemy.selenium.exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AssignmentGrabbedText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//1. select a checkbox and grab the label text
		
		driver.findElement(By.id("checkBoxOption2")).click();
		
		String checkboxText = driver.findElement(By.xpath("//label[@for='benz']")).getText();

		//2. select dropdown option according to grabbed checkbox's text
		
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		
		Select dropdownOptions = new Select(dropdown);
		
		dropdownOptions.selectByVisibleText(checkboxText);
		
		//3. enter grabbed checkbox's text in editbox
		
		driver.findElement(By.id("name")).sendKeys(checkboxText);
		
		//4. click alert and verify if grabbed text is presented in the pop up message
		
		driver.findElement(By.id("alertbtn")).click();
		
		//System.out.println(driver.switchTo().alert().getText());
		
		//String alertMessage = driver.switchTo().alert().getText().toString();
		
		String alertText = driver.switchTo().alert().getText().split(",")[0].split(" ")[1];
		
		//String alertText = alertMessage.split(",")[0].split(" ")[1];
		
		//String[] splittedText = alertText.split(",");
		
		//System.out.println(alertText);
		
		Assert.assertEquals(alertText, checkboxText);
		
		Thread.sleep(3000L);
		
		driver.quit();

	}

}
