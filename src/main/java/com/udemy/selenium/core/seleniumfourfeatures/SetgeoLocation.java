package com.udemy.selenium.core.seleniumfourfeatures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v117.browser.Browser;
import org.openqa.selenium.devtools.v117.browser.model.PermissionType;




public class SetgeoLocation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		DevTools devTools = driver.getDevTools();
		devTools.createSession();

//		List<PermissionType> arrPermissions = new ArrayList<PermissionType>();
//		arrPermissions.add(PermissionType.GEOLOCATION);
//		
//		devTools.send(Browser.grantPermissions(arrPermissions, Optional.of("https://www.openstreetmap.org/"), Optional.empty()));
		
		//devTools.send(Emulation.setGeolocationOverride(Optional.of(40), Optional.of(3), Optional.of(100) ));
		
		Map<String, Object> geoData = new HashMap<String, Object>();
		geoData.put("latitude", 40);
		geoData.put("longitude", 3);
		geoData.put("accuracy", 100);
		
		
		driver.executeCdpCommand("Emulation.setGeolocationOverride", geoData);

		//driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.id("W0wltc")).click();
		driver.findElement(By.name("q")).sendKeys("netflix");
		Thread.sleep(2000L);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000L);
		driver.findElements(By.cssSelector(".LC20lb")).get(0).click();
		String title = driver.findElement(By.cssSelector(".default-ltr-cache-jpuyb8")).getText();
		System.out.println(title);

		Thread.sleep(3000L);
		driver.quit();

	}

}
