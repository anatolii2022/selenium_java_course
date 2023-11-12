package com.udemy.selenium.core.seleniumfourfeatures;

import java.time.Duration;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v117.fetch.Fetch;
import org.openqa.selenium.devtools.v117.network.model.Request;

public class NetworkMocking {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		DevTools devTools = driver.getDevTools();
		devTools.createSession();

		devTools.send(Fetch.enable(Optional.empty(), Optional.empty()));
		devTools.addListener(Fetch.requestPaused(), req -> {
			Request request = req.getRequest();
			if (request.getUrl().contains("shetty")) {
				String newURL = request.getUrl().replace("=shetty", "=BadGuy");
				devTools.send(Fetch.continueRequest(req.getRequestId(), Optional.of(newURL), Optional.empty(),
						Optional.empty(), Optional.empty(), Optional.empty()));
			} else {
				devTools.send(Fetch.continueRequest(req.getRequestId(), Optional.of(request.getUrl()), Optional.empty(),
						Optional.empty(), Optional.empty(), Optional.empty()));
			}
		});

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.cssSelector("[routerlink='/library']")).click();

		String expectedMessage = driver.findElement(By.tagName("p")).getText();
		
		System.out.println(expectedMessage);
		
		Thread.sleep(3000L);
		driver.quit();
	}

}
