package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	/*
	 * Page Object Model
	 */
	
	WebDriver driver;
	
	By loggedInUser = By.xpath("//*[contains(@class,'oxd-userdropdown-name')]");
	By logoutLink = By.xpath("(//*[@class='oxd-userdropdown-link'])[4]");
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void Perform_Logout() {
		driver.findElement(loggedInUser).click();
		driver.findElement(logoutLink).click();
	}
	
	/*
	 * Page factory Model
	 */
	
//	WebDriver driver;
//	
//	@FindBy(xpath = "//*[contains(@class,'oxd-userdropdown-name')]")
//	WebElement loggedInUser;
//	
//	@FindBy(xpath = "(//*[@class='oxd-userdropdown-link'])[4])")
//	WebElement logoutLink;
//	
//	public HomePage(WebDriver driver) {
//		this.driver = driver;
//		PageFactory.initElements(driver,HomePage.class);
//	}
//	
//	public void Perform_Logout() {
//		loggedInUser.click();
//		logoutLink.click();
//	}

}
