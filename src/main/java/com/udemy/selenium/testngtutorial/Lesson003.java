package com.udemy.selenium.testngtutorial;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Lesson003 {

	@Test(dataProvider = "fetchData")
	public void logIn(String username, String password) {
		System.out.println("Enter " + username);
		System.out.println("Enter " + password);
	}

	@DataProvider(name = "fetchData")
	public Object[][] getData() {

		Object[][] data = new Object[3][2];
		data[0][0] = "goodUser";
		data[0][1] = "goobPassword";
		data[1][0] = "fraudUser";
		data[1][1] = "fraudPassword";
		data[2][0] = "newUser";
		data[2][1] = "newPassword";

		return data;
	}

}
