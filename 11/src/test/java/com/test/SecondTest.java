package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SecondTest {
	
	String driverPath = "..\\11\\";
	
	@Test
	public void tc_registration() throws Exception
	{
		System.setProperty("webdriver.gecko.driver", driverPath+"geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
				
		driver.get("http://dev.itutorindia.com/a/");
		
		Thread.sleep(2000L);
		
		driver.findElement(By.id("register")).click();
		
		Thread.sleep(2000L);
		
		driver.findElement(By.id("name")).sendKeys("Deepak Srivastava");
		
		Thread.sleep(2000L);
		
		Select select = new Select(driver.findElement(By.id("school")));
		
		select.selectByIndex(2);
		
		Thread.sleep(2000L);
		
		driver.findElement(By.id("email_id")).sendKeys("abc@gmail.com");
		
		Thread.sleep(3000L);
		
		System.out.println("------------------------------------------------");
		System.out.println(driver.findElement(By.xpath("//*[@id=\"email_error\"]")).getText());
		
		
		Thread.sleep(10000L);
		
		Select select1 = new Select(driver.findElement(By.id("isd_code")));
		
		select1.selectByValue("+91");
		
		Thread.sleep(2000L);
		
		driver.findElement(By.id("mobile")).sendKeys("8989898989");
		

		
	}

}
