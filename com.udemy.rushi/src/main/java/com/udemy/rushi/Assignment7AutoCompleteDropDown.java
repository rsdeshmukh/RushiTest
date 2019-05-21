package com.udemy.rushi;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment7AutoCompleteDropDown {

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

		

	}

}
