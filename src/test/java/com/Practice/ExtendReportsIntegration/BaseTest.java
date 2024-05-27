package com.Practice.ExtendReportsIntegration;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.model.Test;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseTest {
	public static WebDriver driver;
	public static String screenshotSubFolderName;
	public static ExtentReports extentReport;
	public static ExtentTest extentTest;
	
	@Parameters("browserName")
	@BeforeTest
	public void setup(ITestContext context, @Optional("chrome") String browserName) {
		switch (browserName.toLowerCase()) {
		case "edge":
			driver = new EdgeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "chrome":
			driver = new ChromeDriver();
			break;
		default:
			System.out.println("Invalid browser");
			break;
		}
		driver.manage().window().maximize();
		String author=context.getCurrentXmlTest().getParameter("author");
		
		extentTest=extentReport.createTest(context.getName());
		extentTest.assignAuthor(author);
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	@AfterMethod
	public void checkStstus(Method m, ITestResult result) {
		if(result.getStatus()== ITestResult.FAILURE) {
			//String screenshotPath=null;
			//screenshotPath=captureScreenshot(result.getTestContext().getName()+"  "+result.getMethod().getMethodName()+".jpg");
		System.out.println(" ------- Failed-------");
		}
		else if(result.getStatus()==ITestResult.SUCCESS) {
			System.out.println("-------Success------");
		}
		//extentTest.assignCategory(m.getAnnotation(Test.class).groups());
	}
	
	@BeforeSuite
	public void intialiseExtentReport() {
		ExtentSparkReporter sparkreporter_all= new ExtentSparkReporter("AllTests.html");
		extentReport = new ExtentReports();
		extentReport.attachReporter(sparkreporter_all);
	}
	@AfterSuite
	public void generateExtentReport() throws Exception {
		extentReport.flush();
		Desktop.getDesktop().browse(new File("AllTests.htlm").toURI());
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
