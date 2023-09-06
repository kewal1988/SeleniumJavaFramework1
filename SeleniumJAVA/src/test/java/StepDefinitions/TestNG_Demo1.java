package StepDefinitions;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Demo1 {
	
	@BeforeTest
	public void setUpTest() {
		System.out.println("Inside Setup Test");
	}
	
	@Parameters({"URL"})
	@Test(priority = 0,groups = "IT")
	public void Execute_IT_Test0(String url) {
		System.out.println("Inside Execute IT Test0");
		System.out.println(url);
	}
	
	@Test(priority = 1,groups = "IT")
	public void Execute_IT_Test1() {
		System.out.println("Inside Execute IT Test1");
	}
	
	@Test(priority = 0,groups = "NONIT")
	public void Execute_NONIT_Test0() {
		System.out.println("Inside Execute NON IT Test0");
	}
	
	@Test(priority = 1,groups = "NONIT")
	public void Execute_NONIT_Test1() {
		System.out.println("Inside Execute NON IT Test1");
	}
	
	@AfterTest
	public void tearDown() {
		System.out.println("Inside tear Down step");
	}

}
