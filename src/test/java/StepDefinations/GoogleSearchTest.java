package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchTest {
	
	WebDriver driver;
	
//	@Given("browser is open")
//	public void browser_is_open() {
//	driver=new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//	}
//
//	@And("user is on google search page")
//	public void user_is_on_google_search_page() throws Exception{
//		driver.navigate().to("https://www.google.com/");
//		Thread.sleep(1000);
//	}
//
//	@When("user enters text in search box")
//	public void user_enters_text_in_search_box() throws Exception{
//	    driver.findElement(By.name("q")).sendKeys("NARWADE SUSHANTH");
//	    Thread.sleep(1000);
//	}
//
//	@And("hits enter")
//	public void hits_enter() throws Exception{
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//		Thread.sleep(1000);
//	}
//
//	@Then("user is navigated to search results")
//	public void user_is_navigated_to_search_results() throws Exception{
//		   
//	   Thread.sleep(5000);
//	   WebElement element=driver.findElement(By.xpath("//h3[text()='narwade sushanth']"));
//	   JavascriptExecutor js=(JavascriptExecutor)driver;
//	   js.executeScript("arguments[0].scrollIntoView(true)", element);
//	   Thread.sleep(5000);
//	   driver.getPageSource().contains("narwade sushanth");
//	   Thread.sleep(2000);
//	   driver.close();
//	   Thread.sleep(2000);
//	   driver.quit();
//	   
//	}

}
