package com.Practice.TestDataExcel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DataProviderExcelLogin {

	@Test(dataProvider= "loginTestData", dataProviderClass=ExcelDataSupplier.class)
	public void loginApplication(String Username, String Password) throws Exception{	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@type='submit']"))));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(Username);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Password);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Assert.assertTrue(driver.findElement(By.xpath("//p[text()='Megha Phophalia user']")).isDisplayed());
		//Thread.sleep(2000);
		driver.quit();
	}
	
}
