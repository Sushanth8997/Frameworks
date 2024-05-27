package com.sushanth.practice;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestGoogle {

	public WebDriver driver;
	@Test
	public void testGoogle() throws Exception{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Narwade Sushanth",Keys.ENTER);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.close();
	}
	@Test
	public void testAmazon() throws Exception{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		//driver.findElement(By.name("field-keywords")).sendKeys("google pixel watch",Keys.ENTER);
		System.out.println(driver.getTitle());
		SoftAssert softAssert=new SoftAssert();
		//   Title assertion 
		String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actualTitle=driver.getTitle();
		softAssert.assertEquals(actualTitle, expectedTitle,"Title is Mismatched");
		
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).perform();
		Thread.sleep(2000);	
		//   URL assertion
		String expectedUrl="https://www.amazon.in/";
		String actualUrl=driver.getCurrentUrl();
		softAssert.assertEquals(actualUrl, expectedUrl,"Url is Mismatched");
		driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span")).click();
		Thread.sleep(2000);
		//  Text assertion
		driver.findElement(By.id("ap_email")).sendKeys("aaaa");
		String expectedText="aaaa";
		String actualText=driver.findElement(By.id("ap_email")).getAttribute("value");
		softAssert.assertEquals(actualText, expectedText,"Text is Mismatched");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		//  Border assertion
		String expectedBorder="0px rgb(17, 17, 17)";
		String actualBorder=driver.findElement(By.xpath("//*[@id=\"auth-error-message-box\"]/div")).getCssValue("border");
		softAssert.assertEquals(actualBorder, expectedBorder,"Border is Mismatched");
		//  Error assertion
		String expectedErrorMessage=driver.findElement(By.xpath("//*[@id=\"auth-error-message-box\"]/div/div/ul/li/span")).getText();
		String actualErrorMessage="We cannot find an account with that email address";
		softAssert.assertEquals(actualErrorMessage, expectedErrorMessage,"ErrorMessage is Mismatched");		
		
		driver.close();
		softAssert.assertAll();
	}
	
}
