package com.udemy.selenium.core.seleniumfourfeatures;

import java.time.Duration;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v117.network.Network;
import org.openqa.selenium.devtools.v117.network.model.Request;
import org.openqa.selenium.devtools.v117.network.model.Response;

public class NetworkLogActivity {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();

		DevTools devTools = driver.getDevTools();
		devTools.createSession();

		devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));

		devTools.addListener(Network.requestWillBeSent(), request -> {
			Request req = request.getRequest();
			//System.out.println(req.getUrl());
			//System.out.println(req.getPostData());
		});

		devTools.addListener(Network.responseReceived(), response -> {
			Response resp = response.getResponse();
			//System.out.println(resp.getUrl());
			//System.out.println(resp.getStatus());
			if(resp.getStatus().toString().startsWith("4")) {
				System.out.println(resp.getUrl() + " is failing with Statucode " + resp.getStatus());
			}
		});

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.cssSelector("[routerlink='/library']")).click();

		Thread.sleep(3000L);
		driver.quit();

	}

}
