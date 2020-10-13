package PageFactoryModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	// create cunstrcutor to call object
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using ="//*[@id=\"m_login\"]/div/div[1]/div/div[2]/div/div/div/div/div/m-login/form/div[2]/input")
	private WebElement username;
	
	@FindBy(how = How.XPATH, using ="//*[@id=\"m_login\"]/div/div[1]/div/div[2]/div/div/div/div/div/m-login/div[2]/label/span")
	private WebElement checkbox;
	
	@FindBy(how = How.XPATH, using ="//*[@id=\"m_login\"]/div/div[1]/div/div[2]/div/div/div/div/div/m-login/div[3]/m-spinner-button/button")
	private WebElement proceed;
	
	@FindBy(how = How.XPATH, using ="//*[@id=\"m_login\"]/div/div[1]/div/div[2]/div/div/div/div/div/m-login/form/div[2]/div/input")
	private WebElement password;
	
	@FindBy(how = How.XPATH, using ="//*[@id=\"m_login\"]/div/div[1]/div/div[2]/div/div/div/div/div/m-login/div[3]/m-spinner-button/button/span/span")
	private WebElement loginbtn;
	
	public void LoginModule(String name, String passwordArg) {
		username.sendKeys(name);
		checkbox.click();
		proceed.click();
		password.sendKeys(passwordArg);
	}
	
	public void LoginClick() {
		loginbtn.click();
	}
}
