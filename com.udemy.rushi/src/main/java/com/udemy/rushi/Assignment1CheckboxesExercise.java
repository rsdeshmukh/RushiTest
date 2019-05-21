package com.udemy.rushi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1CheckboxesExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://qaclickacademy.com/practice.php");
		
		//Question 1
		WebElement ch1=driver.findElement(By.cssSelector("input[id='checkBoxOption1']"));
		
		ch1.click();
		Assert.assertTrue(ch1.isSelected());
		
		ch1.click();	
		Assert.assertFalse(ch1.isSelected());
		
		
		
		//Question 2
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		
	}

}
