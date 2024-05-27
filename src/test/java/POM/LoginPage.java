package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(name = "txtUserName")
	WebElement txt_Username;
	@FindBy(name="txtPassword")
	WebElement txt_Password;
	@FindBy(name="Submit")
	WebElement btn_Login;
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
	}
	
	public void enterUsername(String username) {
		txt_Username.sendKeys(username);
	}
	public void enterPassword(String password) {
		txt_Password.sendKeys(password);
	}
	public void clickLoginButton() {
		btn_Login.click();
	}
}
