package com.udemy.rushi;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathParentChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//form[@id='tsf']/div[2]/div/div[1]/div/div[1]/input")).sendKeys("Rushikesh Deshmukh");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)","");
		
		driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']/center/input[1]")).click();
	}

}
