package com.udemy.rushi;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4WindowSwitch {

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

		// click on the Multiple Windows text
		driver.findElement(By.xpath("//a[@href='/windows']")).click();

		// click on click here link to open child window
		driver.findElement(By.cssSelector("a[href='/windows/new']")).click();

		Set<String> wh = driver.getWindowHandles();
		Iterator<String> itr = wh.iterator();

		String parentWindow = itr.next();
		String childWindow = itr.next();

		// Switch to child window and print text
		driver.switchTo().window(childWindow);
		System.out.println(driver.findElement(By.xpath("//div[@class='example']/child::h3")).getText());

		// Switch back to parent window and print text
		driver.switchTo().window(parentWindow);
		System.out.println(driver.findElement(By.xpath("//div[@class='example']/child::h3")).getText());

	}

}
