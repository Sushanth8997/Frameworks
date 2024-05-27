package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.*;

public class LoginDemoSteps {
	
//	WebDriver driver;
//	
//	@Given("browser is open")
//	public void browser_is_open() {
//		
//	   driver=new FirefoxDriver();
//	   driver.manage().window().maximize();
//	}
//	@And("user is on login page")
//	public void user_is_on_login_page() throws Exception{
//		
//	  driver.navigate().to("http://183.82.103.245/nareshit/login.php");
//	  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//	  //Thread.sleep(3000);
//	  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
//	  wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("Submit"))));
//	}
//	@When("^user enters valid (.*) and (.*)$")
//	public void user_enters_valid_username_and_password(String username, String password) {
//		
//	   driver.findElement(By.name("txtUserName")).sendKeys(username);
//	   driver.findElement(By.name("txtPassword")).sendKeys(password);
//	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//	}
//	@And("hits enter")
//	public void hits_enter() throws Exception{
//		
//		driver.findElement(By.name("Submit")).click();
//		Thread.sleep(3000);   
//	}
//	@Then("user is navigated to home page")
//	public void user_is_navigated_to_home_page() {
//		
//		driver.getPageSource().contains("Welcome nareshit");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		driver.close();
//	}
}
