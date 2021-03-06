package com.rushi.test;

import org.testng.annotations.Test;

//import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class NewTest {
	WebDriver driver;
	ExplicitWait exWait;

	/*
	 * @Test public void searchOnGoogle() { driver.get("https://www.google.co.in");
	 * driver.findElement(By.xpath("//input[@name='q']")).sendKeys("crmnext" +
	 * Keys.ENTER); // driver.findElement(By.name("btnK")).click(); List<WebElement>
	 * lwe = driver.findElements(By.tagName("a"));
	 * System.out.println("All links are:"); for (int i = 0; i < lwe.size(); i++) {
	 * if (!lwe.get(i).getText().isEmpty()) { System.out.println(i + ":" +
	 * lwe.get(i).getText()); } } }
	 */

	@Test
	public void searchOnCRMNEXT() {
		driver.get("http://my.crmnext.com");
		driver.findElement(By.id("TxtName")).sendKeys("rushikesh.deshmukh@crmnext.in");
		driver.findElement(By.id("TxtPassword")).sendKeys("Acid_008");

		exWait.untilElementToBeClickable(By.xpath("//input[@type='submit' and @value='Login']")).click();
		String recent = exWait.untilElementToBeClickable(By.xpath("//span[@title='Recently Accessed']"))
				.getText();
		// driver.findElement(By.xpath("//input[@type='submit' and
		// @value='Login']")).click();
		System.out.println("My Current URL: " + driver.getCurrentUrl());
		System.out.println(recent);
	}

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		exWait = new ExplicitWait(driver, 20);
	}

}
