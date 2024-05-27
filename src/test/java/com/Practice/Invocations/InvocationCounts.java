package com.Practice.Invocations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationCounts {
	WebDriver driver;
	@Test(invocationCount=4, threadPoolSize=2)
	public void test1() throws Exception{
		
		driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.navigate().to("https://randomuser.me/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@data-label='name']")).click();
		Thread.sleep(1000);
		System.out.println(" Username: " +driver.findElement(By.id("user_value")).getText());
		driver.findElement(By.xpath("//li[@data-label='email']")).click();
		Thread.sleep(1000);
		System.out.println(" Email Id: " +driver.findElement(By.id("user_value")).getText());
		driver.quit();	
	}
}
