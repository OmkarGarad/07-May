  package com.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import  org.apache.log4j.Logger;




public class TestBase {
	
	
 public static  WebDriver driver= null;
	
	
public static Logger log =Logger.getLogger(TestBase.class);
	
	public WebDriver initialization(){
		//try{
			log.info("initializing browser");
			log.warn("chromedriver file should present at the location");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		//}catch(Exception e){
			//log.info(e.getMessage());
			//log.info(e.getClass().getName());
			//log.error("chromedriver file is not available");
		//}
		log.info("chrome browser opened");
		driver.manage().window().maximize();
		driver.get("file:///F:/SELENIUM%20TESTING/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
		log.info("JBK offline Application launched");
		return driver;
		
	}
	

}
