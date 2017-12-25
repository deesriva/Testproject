package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirstTest {
	
	/****
	 * 
	 * Git Changes comment
	 */
	
	String driverPath = "..\\11\\";
	
	@Test
	public void tc_1() throws InterruptedException
	{

		System.setProperty("webdriver.gecko.driver", driverPath+"geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
				
		driver.get("http://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		Thread.sleep(3000l);
		driver.findElement(By.linkText("Downloads - Selenium")).click();
		
		System.out.println("Test passed");
		
	}
	

}
