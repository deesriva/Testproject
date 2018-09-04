package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirstTest {
	
	/****
	 * 
	 * Git Changes comment 3rd Changes.
	 */
	
	String driverPath = "..\\11\\";
	
	@Test
	public void tc_1() throws InterruptedException
	{
		
		//ChromeOptions chromeOptions = new ChromeOptions();
		//chromeOptions.setBinary("/Applications/Google Chrome Canary.app/Contents/MacOS/Google Chrome Canary");
		//chromeOptions.setBinary(driverPath+"chromedriver.exe");
		//chromeOptions.addArguments("--headless");
			System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
		//WebDriver driver = new ChromeDriver(chromeOptions);
			WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", driverPath+"geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		
				
		driver.get("http://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		Thread.sleep(3000l);
		driver.findElement(By.linkText("Downloads - Selenium")).click();
		
		System.out.println("Test passed successfully");
		
		driver.quit();
		
	}
	

}
