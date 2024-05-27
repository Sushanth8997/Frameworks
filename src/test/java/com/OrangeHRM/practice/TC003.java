package com.OrangeHRM.practice;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.Assert;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;

	public class TC003 {

		WebDriver driver;
		
		@Parameters({"Browser","url","username","password"})
		@Test(groups= {"regression"})
		public void launchBrowser(String browser, String url, String Username, String Password) throws Exception{
			switch(browser.toLowerCase()) {
			case "chrome":
				driver=new ChromeDriver();
				break;
			case "edge":
				driver=new EdgeDriver();
				break;
			case "firefox":
				driver=new FirefoxDriver();
				break;
			default:
				System.out.println("Invalid browser selection");
				break;
			}
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.navigate().to(url);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(Username);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Password);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
			Thread.sleep(2000);
			String expectedText= "Employee Information";
			String actualText = driver.findElement(By.xpath("//h5[text()='Employee Information']")).getText();
			Assert.assertEquals(actualText, expectedText, "Employee Information text is mismatched");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='Logout']")).click();
			Thread.sleep(2000);
			driver.close();
		}
	}
