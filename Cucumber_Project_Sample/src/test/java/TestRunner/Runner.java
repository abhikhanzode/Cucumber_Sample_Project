package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features ="src/test/java/features",
		glue = {"Stepdefinations"},
		plugin = {"pretty","html:target/cucumber","json:target/cucumber.json"}
		)
public class Runner extends AbstractTestNGCucumberTests {


}
