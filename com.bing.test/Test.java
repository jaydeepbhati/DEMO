package com.bing.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.bing.utilities.CommonUtilities;
import com.bing.utilities.Driver;

public class Test {
	public static void main(String[] args) {

		Driver.driver = Driver.browser("firefox");
		CommonUtilities.launchBrowser("http://www.bing.com");

		Driver.driver.findElement(By.id("sb_form_q")).sendKeys("James Bond");
		Driver.driver.findElement(By.id("sb_form_go")).click();
		
		try {

			WebElement wikilink= Driver.driver.findElement(By.linkText("James Bond - Wikipedia, the free encyclopedia"));
			Assert.assertEquals(true, wikilink.isDisplayed());
			System.out.println("Wikipedia link for James Bond is present");
		} catch (Exception e) {
			System.out.println("Wikipedia link for James Bond is Not present");;
		}
		
		Driver.driver.close();
	}

}
