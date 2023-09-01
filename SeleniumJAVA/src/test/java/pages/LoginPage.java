package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver; 

	//Page Object Model
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}

	By txt_username=By.name("username");
	By txt_password=By.name("password");
	By btn_login = By.xpath("//*[contains(@class,'orangehrm-login-button')]");

	public void enterUsername(String username){
		driver.findElement(txt_username).clear();
		driver.findElement(txt_username).sendKeys("Admin");

	}

	public void enterPassword(String password) {
		driver.findElement(txt_password).clear();
		driver.findElement(txt_password).sendKeys("admin123");
	}

	public void clickLogin() {
		driver.findElement(btn_login).click();
	}
	
	
	/**
	 * Page Factory Model
	 * Refer below code
	 */
	
//	@FindBy(name = "username")
//	WebElement txtUsername;
//	
//	@FindBy(name="password")
//	WebElement txtPassword;
//	
//	@FindBy(xpath = "//*[contains(@class,'orangehrm-login-button')]")
//	WebElement btnLogin;
//	
//	public LoginPage(WebDriver driver) {
//		this.driver=driver;
//		PageFactory.initElements(driver, LoginPage.class);
//	}
//
//
//	public void enterUsername(String username){
//		txtUsername.clear();
//		txtUsername.sendKeys(username);
//
//	}
//
//	public void enterPassword(String password) {
//		txtPassword.clear();
//		txtPassword.sendKeys(password);
//	}
//
//	public void clickLogin() {
//		btnLogin.click();
//	}

}
