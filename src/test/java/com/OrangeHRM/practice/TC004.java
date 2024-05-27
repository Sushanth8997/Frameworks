package com.OrangeHRM.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC004 {

	@Test(dataProvider= "loginTestData")
	public void loginApplication(String Username, String Password) throws Exception{	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(Username);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.xpath("//p[text()='Megha Phophalia user']")).isDisplayed());
		Thread.sleep(2000);
		driver.quit();
	}
	
	@DataProvider(name="loginTestData")
	public Object[][] loginData(){
		Object[][] data=new Object[][]{
		{"Admin","admin123"},
		
		{"Admin" ,"admin8888"},
		
		{"admin123","admin123"}
		};
		return data;
	}
}
