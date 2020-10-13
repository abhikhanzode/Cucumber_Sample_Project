package Stepdefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import PageFactoryModel.ATL_EstimateCreate;
import PageFactoryModel.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//@RunWith(Cucumber.class)
public class stepdefination {
	public static WebDriver driver;
	public static LoginPage Login;
	public static ATL_EstimateCreate atlEstCrt;

	@Given("^launch the URL$")
	public void launch_the_url() throws Throwable {
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito","--disable-notifications");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://qa.m-net.in/login"); //https://qa.m-net.in/login
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

	}

	@When("^Login with valid username: \"([^\"]*)\" and Password: \"([^\"]*)\"$")
	public void login_with_valid_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
		Login = new LoginPage(driver);
		Login.LoginModule(strArg1, strArg2);
		Thread.sleep(3000);
	}

	@Then("^click on login button and user will be on dashboard$")
	public void click_on_login_button_and_user_will_be_on_dashboard() throws Throwable {

		Login.LoginClick();
		Thread.sleep(4000);
	}

	@And("^Search and Open the Application : \"([^\"]*)\"$")
	public void search_and_Open_the_Application(String apps) throws Throwable {
		atlEstCrt = new ATL_EstimateCreate(driver);
		atlEstCrt.SearchApplication(apps);
	}

	@Then("^Select import from Estimate module$")
	public void select_import_from_estimate_module() throws Throwable {
		atlEstCrt.SelectEstimate_import();
	}

	@Then("^Logout the application$")
	public void logout_the_application() throws Throwable {
		System.out.println("Logout The Application");   
		driver.close();
	}

}
