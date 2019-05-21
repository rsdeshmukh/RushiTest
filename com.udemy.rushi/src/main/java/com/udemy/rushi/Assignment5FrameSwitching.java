package com.udemy.rushi;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5FrameSwitching {

	public static void main(String[] args) {
		try {
			Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// navigate to the-internet.herokuapp.com demo page
		driver.get("http://the-internet.herokuapp.com/");

		// click on the Frames text
		driver.findElement(By.xpath("//a[@href='/frames']")).click();

		// click on the Nested Frames text
		driver.findElement(By.xpath("//a[@href='/nested_frames']")).click();

		
	    //switch to 1st frame
		WebElement frameElement1= driver.findElement(By.xpath("//frameset/child::frame[@name='frame-top']"));
		driver.switchTo().frame(frameElement1);
		
		//switch to middle frame
		WebElement frameElement2= driver.findElement(By.xpath("//frame[@name='frame-middle']"));
		driver.switchTo().frame(frameElement2);
		
		System.out.println(driver.findElement(By.id("content")).getText());
		
	}

}
