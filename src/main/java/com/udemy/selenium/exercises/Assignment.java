package com.udemy.selenium.exercises;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/angularpractice/");

		driver.findElement(By.name("name")).sendKeys("anatoli");
		driver.findElement(By.name("email")).sendKeys("vasylenkoanatolii1989@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Start123!");

		driver.findElement(By.id("exampleCheck1")).click();

		WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select genderOptions = new Select(dropdown);

		genderOptions.selectByVisibleText("Female");
		
		Thread.sleep(2000L);
		
		genderOptions.selectByIndex(0);

		
		driver.findElement(By.id("inlineRadio1")).click();
		
		System.out.println(driver.findElement(By.id("inlineRadio1")).isSelected());
		
		driver.findElement(By.name("bday")).sendKeys("11.03.1989");
		
		driver.findElement(By.cssSelector("input.btn-success")).click();
		
		Thread.sleep(2000L);
		
		System.out.println(driver.findElement(By.cssSelector("div.alert-success")).getText());
		
		driver.quit();
	}

}
