package com.udemy.rushi;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8WebTables {

	public static void main(String[] args) throws InterruptedException {
		try {
			Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// navigate to qaclickacademy practice page
		driver.get("http://www.qaclickacademy.com/practice.php");

		WebElement asdd = driver.findElement(By.id("autocomplete"));
		asdd.sendKeys("ind");
		Thread.sleep(1000);
		for (int i = 0; i < 2; i++) {
			asdd.sendKeys(Keys.DOWN);
		}

		JavascriptExecutor js = (JavascriptExecutor) driver;
		String value = (String) js.executeScript("return document.getElementById('autocomplete').value");

		if (value.equals("India")) {
			System.out.println("Pass...India is Selected");
		} else {
			System.out.println("Fail...India not Selected " + value);
		}
	}

}
