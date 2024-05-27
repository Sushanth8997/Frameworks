package com.Practice.FailureScreenShots;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	public static WebDriver driver;
	public static String screenshotSubFolderName;
	
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	public void captureScreenshot(String fileName) {
		if(screenshotSubFolderName==null) {
			 LocalDateTime myDateObj = LocalDateTime.now();
			   // System.out.println("Before formatting: " + myDateObj);
			    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
			    screenshotSubFolderName= myDateObj.format(myFormatObj);
			   // System.out.println("After formatting: " + formattedDate);
		}
		TakesScreenshot takeScreenshot= (TakesScreenshot) driver;
		File sourceFile = takeScreenshot.getScreenshotAs(OutputType.FILE);	
		File destFile = new File("./Screenshots/"+ screenshotSubFolderName+"/"+fileName);
		
		try {
			
			FileUtils.copyFile(sourceFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(" Screenshot Captured successfully ");
	}

}
