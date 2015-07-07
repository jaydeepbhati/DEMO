package com.bing.utilities;

import org.openqa.selenium.WebElement;

public class CommonUtilities {
	public static boolean launchBrowser(String url) {
		try {

			Driver.driver.get(url);
			System.out.println("Browser Launched Succesfully");
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	public static boolean clickEvent(WebElement element) {
		try {

			element.click();
			
		} catch (Exception e) {
			return false;
		}
		return true;
	}

}
