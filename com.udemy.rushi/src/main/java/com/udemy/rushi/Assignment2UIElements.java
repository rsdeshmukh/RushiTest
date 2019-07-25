package com.udemy.rushi;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment2UIElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// navigate to cleartrip
		driver.get("https://www.cleartrip.com/");

		// click on the one way radio button
		driver.findElement(By.cssSelector("input[value='OneWay']")).click();

		// Select adult dropdown
		Select s1 = new Select(driver.findElement(By.id("Adults")));
		s1.selectByValue("5");

		// Select children dropdown
		Select s2 = new Select(driver.findElement(By.id("Childrens")));
		s2.selectByValue("2");

		// click on the calendar and select today's date
		driver.findElement(By.xpath("//input[@id='DepartDate']")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

		// click on the More option link
		driver.findElement(By.id("MoreOptionsLink")).click();

		// Enter Indigo text in the Preferred Airlines
		driver.findElement(By.cssSelector("#AirlineAutocomplete")).sendKeys("Indigo");

		// click on the Search flight button
		driver.findElement(By.id("SearchBtn")).click();

		// verify error message
		Assert.assertTrue(driver.findElement(By.id("homeErrorMessage")).getText()
				.contains("Sorry, but we can't continue until you fix everything that's marked in"));

	}

}
