package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath ="//a[text()='Logout']")
	WebElement btn_logout;
	
	//public void logoutIsDisplayed() {
		//btn_logout.isDisplayed();
	//}
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		}
	public void logoutIsDisplayed() {
		btn_logout.isDisplayed();		
	}
}
