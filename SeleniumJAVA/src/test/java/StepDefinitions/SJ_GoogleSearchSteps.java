package StepDefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class SJ_GoogleSearchSteps {
	
	WebDriver driver = null;

	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Inside - browser is open");
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	}

	@Given("user is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("Inside - user is on google search page");
		
		driver.navigate().to("https://google.com");
		}

	@When("user enter a text in search box")
	public void user_enter_a_text_in_search_box() {
		System.out.println("Inside - user enter a text in search box");
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
	}

	@When("hits enter")
	public void hits_enter() {
		System.out.println("Inside - hits enter");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigate to search results")
	public void user_is_navigate_to_search_results() {
		System.out.println("Inside - user is navigate to search results");
		driver.getPageSource().contains("Online Courses");
		
		driver.close();
	}


}
