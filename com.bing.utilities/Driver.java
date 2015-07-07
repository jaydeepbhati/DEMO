package com.bing.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

	public static WebDriver driver = null;

	public static WebDriver browser(String browser) {
		try {
			if (browser.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
			}

		} catch (Exception e) {
			return null;
		}
		return driver;
	}
}
