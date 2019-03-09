package com.rushi.test;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class NewTest {
	WebDriver driver;

	@Test
	public void function() {
		driver.get("https://www.google.co.in");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("crmnext" + Keys.ENTER);
		// driver.findElement(By.name("btnK")).click();
		List<WebElement> lwe = driver.findElements(By.tagName("a"));
		System.out.println("All links are:\n");
		for (int i = 0; i < lwe.size(); i++) {
			if (!lwe.get(i).getText().isEmpty()) {
				System.out.println(i + ":" + lwe.get(i).getText() + "\n");
			}
		}
	}

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
	}

}

