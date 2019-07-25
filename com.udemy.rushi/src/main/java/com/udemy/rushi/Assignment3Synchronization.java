package com.udemy.rushi;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3Synchronization {

	public static void main(String[] args) {
		try {
			Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// navigate to itgeared demo page
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		
		//click on the 'Click to load....' link
		driver.findElement(By.xpath("//a[contains(@href,'javascript: void(0);loadAjax();')]")).click();
		
		//Explicit wait applied on #results element, wait until the element is visible
		WebDriverWait ww=new WebDriverWait(driver, 5);
		ww.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results")));
		
		//read text from the element and print on console
		System.out.println(driver.findElement(By.cssSelector("#results")).getText());
		
	}

}
