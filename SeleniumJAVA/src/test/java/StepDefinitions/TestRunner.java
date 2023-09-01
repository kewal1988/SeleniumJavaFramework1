package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions
(
		features = "src/test/resources/Features",
		glue = "StepDefinitions",
		monochrome=true,
		tags="@smoketest",
		plugin = {"pretty","html:target/HTMLReports",
				"json:target/cucumber.json",
				"junit:target/JUNITReport/cucumber.xml"}
)
public class TestRunner {

}
