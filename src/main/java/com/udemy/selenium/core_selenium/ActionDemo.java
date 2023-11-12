package com.udemy.selenium.core_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a#nav-logo-sprites")));
		
		driver.findElement(By.xpath("//div[@class='glow-toaster-footer']/span[1]")).click();
		
		Actions action = new Actions(driver);
		
		WebElement helloMenu = driver.findElement(By.xpath("//div[@id='nav-tools']/a[2]"));
		
		action.click(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		//move to the specific element
		action.moveToElement(helloMenu).build().perform();
		
		Thread.sleep(3000L);
		
		driver.quit();
		
	}
}
