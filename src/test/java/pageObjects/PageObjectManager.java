package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public LandingPage landingPage;
	public WebDriver driver;
	
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	 public LandingPage getLandingPage() {
		 landingPage = new LandingPage(null);
		 return landingPage;
	 }
	 public OffersPage offersPage() {
		 OffersPage offersPage = new OffersPage(driver);
		 return offersPage;
	 }
	public  CheckOutPage getCheckOutPage() {
		// TODO Auto-generated method stub
		return null;
	}

}
