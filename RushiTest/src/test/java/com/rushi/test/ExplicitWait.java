package com.rushi.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	WebDriverWait wdw;

	ExplicitWait(WebDriver driver, long time) {
		wdw = new WebDriverWait(driver, time);
	}
	
	public WebElement untilElementToBeClickable(By locator) {
		
		WebElement element=wdw.until(ExpectedConditions.elementToBeClickable(locator));
		System.out.println("I am Waiting...");
		return element;
	}
}
