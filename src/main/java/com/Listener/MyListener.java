package com.Listener;

import java.io.File;

import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.Base.TestBase;









public class MyListener implements ITestListener {
	
	
	SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyyhhmmss");
	
	
	
	public void onTestStart(ITestResult result) {
		TestBase.log.info("Testcase start with name"+result.getName());
		
	}
	

	public void onTestSuccess(ITestResult result) {
		TestBase.log.info("Testcase passed with name"+result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		TestBase.log.info("Testcase failed with name"+result.getName());
		/*TakesScreenshot ts = (TakesScreenshot)TestBase.driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		String path= System.getProperty("user.dir")+"/screenshots/Demo"+".png";
		try {
			TestBase.log.info("saving a screenshot for failed testcase");
			FileUtils.copyFile(src, new File(path));
		}catch(Exception e) {
			TestBase.log.error("screenshot is not saved");
			TestBase.log.error(e.getClass().getName());
		}*/}
	

	public void onTestSkipped(ITestResult result) {
		TestBase.log.info("Testcase skipped with name"+result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	public void onStart(ITestContext context) {
		
		
	}

	public void onFinish(ITestContext context) {
		
		
	}

}
