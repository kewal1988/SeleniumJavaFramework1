package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pages.HomePage;
import pages.LoginPage;

public class LoginSteps {
	WebDriver driver=null;
	LoginPage _loginPage =null;
	HomePage _homePage = null;

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("Inside : user is on login page");
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String username, String password)  { 
		System.out.println("Inside : user enters username and password");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		_loginPage = new LoginPage(driver);
		_loginPage.enterUsername(username);
		_loginPage.enterPassword(password);
		
	}

	@When("click on login button")
	public void click_on_login_button()  {
		System.out.println("Inside : click on login button");
		_loginPage.clickLogin();
	
	}

	@Then("user is navigate to the home page")
	public void user_is_navigate_to_the_home_page() {
		System.out.println("Inside : user is navigate to the home page");
		_homePage = new HomePage(driver);
		_homePage.Perform_Logout();
		driver.close();
	}


}
