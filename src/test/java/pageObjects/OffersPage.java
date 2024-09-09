package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {

	public WebDriver driver;
	public OffersPage(WebDriver driver) {
	
	}
	
	private By search =By.xpath("//input[@type=\"search\"]");
	//By submit= By.xpath("//button[@type=\"submit\"]");
	private By productName =By.cssSelector("tr td:nth-child(1)");

	public void searchItem(String name) {
		driver.findElement(search).sendKeys(name);
	}
	
	
	public String getProductNmae() {
		return driver.findElement(productName).getText();
	}
}
