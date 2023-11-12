package com.udemy.selenium.core.autoit;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
		String downloadPath = System.getProperty("user.dir");
		// Upload
		HashMap<String, Object> chPrefs = new HashMap<String, Object>();
		chPrefs.put("profile.default_content_settings.popups", 0);
		chPrefs.put("download.default_directory", downloadPath);

		ChromeOptions chOptions = new ChromeOptions();
		chOptions.setExperimentalOption("prefs", chPrefs);
		WebDriver driver = new ChromeDriver(chOptions);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://altoconvertpdftojpg.com/");
		driver.findElement(By.id("browse")).click();
		Thread.sleep(2000L);
		Runtime.getRuntime().exec("src\\main\\resources\\fileupload.exe");

		Thread.sleep(2000L);
		
		driver.findElement(By.id("submit_btn")).click();
		// Download
		WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(70));
		driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[href*='download']")));
		driver.findElement(By.cssSelector("a[href*='download']")).click();

		Thread.sleep(2000L);

		File file = new File(downloadPath + "/maven.zip");
		boolean fileDownload = file.exists();
		Assert.assertTrue(fileDownload);
		file.delete();

		Thread.sleep(2000L);
		driver.quit();
	}

}
