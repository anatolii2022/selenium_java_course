package com.udemy.selenium.core.databaseconnection;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaDBCConnection {

	public static void main(String[] args) throws SQLException, IOException, InterruptedException {
		// TODO Auto-generated method stub#
		String allData = "select * from Employeeinfo;";
		String firstRow = "select * from Employeeinfo where name='sam';";

		FileInputStream input = new FileInputStream(new File("src\\main\\resources\\db.properties"));
		Properties prop = new Properties();
		prop.load(input);

		String host = prop.getProperty("host");
		String port = prop.getProperty("port");
		String database = prop.getProperty("database");
		String user = prop.getProperty("user");
		String password = prop.getProperty("password");

		Connection connection = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + database, user,
				password);
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(firstRow);
		while (resultSet.next()) {
			
			WebDriver driver = new FirefoxDriver();
			
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			driver.findElement(By.id("W0wltc")).click();
			driver.findElement(By.name("q")).sendKeys(resultSet.getString("name") + " " + resultSet.getString("location"));
			
			Thread.sleep(3000L);
			driver.quit();
		}
		connection.close();

	}

}
