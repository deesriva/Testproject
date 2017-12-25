package com.test;

import org.openqa.selenium.By;
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
	public void tc_1()
	{

		System.setProperty("webdriver.gecko.driver", driverPath+"geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
				
		driver.get("http://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		
	}
	

}
