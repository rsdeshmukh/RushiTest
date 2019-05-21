package com.udemy.rushi;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment6PracticeExercise {

	public static void main(String[] args) {
		try {
			Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// navigate to qaclickacademy practice page
		driver.get("http://www.qaclickacademy.com/practice.php");

		driver.findElement(By.id("checkBoxOption2")).click();

		String checkboxText = driver.findElement(By.id("checkBoxOption2")).getAttribute("value");

		Select s = new Select(driver.findElement(By.id("dropdown-class-example")));
		s.selectByValue(checkboxText);

		driver.findElement(By.cssSelector("#name")).sendKeys(checkboxText);

		driver.findElement(By.cssSelector("#alertbtn")).click();

		Alert a = driver.switchTo().alert();

		//System.out.println(a.getText());
		
		Assert.assertTrue(a.getText().contains(checkboxText));

		a.accept();

	}

}
