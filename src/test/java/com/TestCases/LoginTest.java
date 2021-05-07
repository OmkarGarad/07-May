package com.TestCases;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Base.TestBase;

public class LoginTest extends TestBase {
	
	 WebDriver driver;
	private static Logger log =Logger.getLogger(LoginTest.class);
	 @Test
	 public void login(){
		 driver = initialization();
		 
		 log.info("login to the application");
		 driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		 driver.findElement(By.id("password")).sendKeys("123456");
		 driver.findElement(By.xpath("//button")).click();
		 log.info("user successfully logged in to the application");
		/* driver.close();
		 log.info("application closed successfully");*/
Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");	 
		 
	 }
}
