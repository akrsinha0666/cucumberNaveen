package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	
	public  WebDriver driver;
	public LandingPage(WebDriver driver) {
	
	}
	
	private By search =By.xpath("//input[@type=\"search\"]");
	//By submit= By.xpath("//button[@type=\"submit\"]");
	private By productName =By.cssSelector("h4.product-name");
	private By topDeals =By.xpath("//a[@href=\"#/offers\"]");
	By increment =By.cssSelector("a.increment");
	By addToCart = By.cssSelector(".product-action button");

	public void searchItem(String name) {
		driver.findElement(search).sendKeys(name);
	}
	
	public void getSearchText() {
		String text = driver.findElement(search).getText();
	}
	
	public String getProductNmae() {
		return driver.findElement(productName).getText();
	}
	
	public void  selectTopDealsPage() {
		driver.findElement(By.xpath("//a[@href=\"#/offers\"]"));
	}
	
	public static void incrementQuantity( int quantity)
	{
		int i= quantity-1;
		while(i>0)
		{
			
			i--;
		}
	}
		
		public void addToCart()
		{
			driver.findElement(addToCart).click();
		}
		
		public String getTitleLandingPage()
		{
			return driver.getTitle();
		}
			

		 
}
