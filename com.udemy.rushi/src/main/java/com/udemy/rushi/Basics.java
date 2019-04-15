package com.udemy.rushi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("keysToSend");
		
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Password");
		driver.findElement(By.name("Login")).click();
		
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
		
		System.out.println("qwerty");
		
		//driver.quit();
	}

}
