package com.udemy.selenium.core_selenium;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingHTTPSCertificates {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions chOptions = new ChromeOptions();

		//set proxy
		Proxy proxy = new Proxy();

		proxy.setHttpProxy("ipaddress:4444");

		chOptions.setCapability("proxy", proxy);

		//accept expired ssl certificates
		chOptions.setAcceptInsecureCerts(true);
		
		// set up download folder
		Map<String, Object> prefs = new HashMap<String, Object>();
		
		prefs.put("download.default_directory", "/directory/path");
		
		chOptions.setExperimentalOption("prefs", prefs);

		WebDriver driver = new ChromeDriver(chOptions);

		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());

		Thread.sleep(3000L);
		driver.quit();
	}

}
