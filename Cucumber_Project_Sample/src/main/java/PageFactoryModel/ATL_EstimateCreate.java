package PageFactoryModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ATL_EstimateCreate {

	public WebDriver driver;

	public ATL_EstimateCreate(WebDriver driver) {
		this.driver = driver;

	}
	
	By search = By.xpath("//*[@id=\"m_quicksearch_input\"]");
	
	By SelectATLapp = By.xpath("//*[@id=\"m_quicksearch\"]/m-portlet/div/div[3]/perfect-scrollbar/div/div[1]/div/div/div");
	
	By clickhamburger = By.xpath("//*[@id=\"m_header\"]/div/div/div[1]/div/div[2]");

	By clicksidebar = By.xpath("//*[@id=\"m_ver_menu\"]/ul[3]/li/a/span");

	By selectestimate = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/ul[3]/li[1]/div[1]/ul[1]/li[3]/a[1]/span[1]");
	


	
	public void SearchApplication(String apps) throws Exception {
		Thread.sleep(5000);
		driver.findElement(search).sendKeys(apps);
		Thread.sleep(8000);
		driver.findElement(SelectATLapp).click();
	}

	public void SelectEstimate_import() throws Exception {
		Thread.sleep(8000);
		Actions action = new Actions(driver);
		driver.switchTo().frame(0);

		WebElement clickham = driver.findElement(clickhamburger);
		action.moveToElement(clickham).click().build().perform();
		
		Thread.sleep(2000);
		
		WebElement sidebar = driver.findElement(clicksidebar);
		action.moveToElement(sidebar).click().build().perform();
		
		Thread.sleep(2000);

		WebElement SelectEstimate = driver.findElement(selectestimate);
		action.moveToElement(SelectEstimate).click().build().perform();

	}
	





}
