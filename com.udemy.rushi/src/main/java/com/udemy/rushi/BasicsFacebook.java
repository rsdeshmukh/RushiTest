package com.udemy.rushi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicsFacebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		
		/*Using XPath -->   //tagName[@attribute='value'],		can put * instead of tagName like //*[@attribute='value']
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("keysToSend");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Password");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		*/
		
		/*Using CSS selector --> tagName[attribute='value'],	can put the tagName empty like [attribute='value']
		Alternate CSS selector --> tagName#id,					can put the tagName empty like #id
		Alternate CSS selector --> tagName.classname, 			can put the tagName empty like .classname
		
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("keysToSend");
		driver.findElement(By.cssSelector("[id='pass']")).sendKeys("password");
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
		*/
		
		
		/*Using XPath regular expression //tagName[contains(@attribute,'value')], can put * instead of tagName like //*[contains(@attribute='value')]
		
		driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("keysToSend");
		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("Password");
		driver.findElement(By.xpath("//input[contains(@value,'Log')]")).click();
		*/	
		
		/*Using CSS Selector regular expression tagName[attribute*='value']*/
		driver.findElement(By.cssSelector("input[name*='email']")).sendKeys("keysToSend");
		driver.findElement(By.cssSelector("input[name*='pass']")).sendKeys("password");
		driver.findElement(By.cssSelector("input[value*='Log']")).click();
		
		driver.quit();
	}

}
