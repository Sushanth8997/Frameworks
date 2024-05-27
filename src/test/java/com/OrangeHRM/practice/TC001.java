package com.OrangeHRM.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class TC001 {

	WebDriver driver;

	@BeforeTest
	@Parameters("browserName")
	public void initializeBrowser(String browserName) {
		switch (browserName.toLowerCase()) {
		case "edge":
			driver = new EdgeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("Invalid browser");
			break;
		}
		driver.manage().window().maximize();
	}

	@AfterTest
	public void tearDown() {
		driver.close();
		System.out.println(" Closed application and browser");
	}
	@Test
	@Parameters("url")
	public void launchApplication(String url) {
		driver.navigate().to(url);
		System.out.println(" Application Opened");
	}

	@Test
	@Parameters({"username", "password"})
	public void enterLoginDetails(String username, String password) throws Exception {
		Thread.sleep(2000);
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		Thread.sleep(2000);
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		System.out.println(" Logged into application");
	}

	@Test
	public void navigateMyInfo() throws Exception{
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a/span")).click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		System.out.println(" Clicked on My Info");
		Thread.sleep(2000);

	}

	@Test
	public void verifyMyInfo() throws Exception {
		driver.findElement(By.xpath("//label[text()='Employee Id']"));
	 	System.out.println(driver.findElement(By.xpath("//label[text()='Employee Id']")).isDisplayed());
	 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	 	Thread.sleep(3000);
	 	System.out.println(" Profile has been displayed and verified");
	}

	@Test
	public void verifyLogin() throws Exception {
		WebElement element = driver.findElement(By.xpath("//label[text()='Employee Full Name']"));
	 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	 	Thread.sleep(3000);
	 	System.out.println(element.isDisplayed());
	 	System.out.println(element.getText());
	 	System.out.println("Profile Verified for Login ");
	}
	@Test
	public void logout() throws Exception {
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		System.out.println(" Clicked on the Profile");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		System.out.println(" Clicked on the Logout");
		Thread.sleep(3000);

	}
}
