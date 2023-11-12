package com.udemy.selenium.core.seleniumfourfeatures;

import java.net.URI;
import java.util.function.Predicate;

import org.openqa.selenium.By;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthentication {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		//Predicate, consumer
		//Predicate<URI> uriPredicate = uri -> uri.getHost().contains("httpbin.org");
		Predicate<URI> uriPredicate = uri -> uri.getHost().contains("herokuapp.com");
		//Cast driver to HasAuthentication
		//((HasAuthentication)driver).register(uriPredicate, UsernameAndPassword.of("foo", "bar"));
		
		((HasAuthentication)driver).register(uriPredicate, UsernameAndPassword.of("admin", "admin"));
		driver.manage().window().maximize();
		//driver.get("https://httpbin.org/basic-auth/foo/bar");
		driver.get("http://the-internet.herokuapp.com/");
		Thread.sleep(3000L);
		driver.findElement(By.linkText("Basic Auth")).click();
		
		Thread.sleep(3000L);
		driver.quit();

	}

}
