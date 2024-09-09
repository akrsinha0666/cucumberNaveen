package stepDefinitions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import pageObjects.OffersPage;
import utils.TestContextSetUp;

public class offersPageStepDefinitions {
	
	WebDriver driver ;
	public String LandingPageproductName;
	public String offerPageProductName;
	
TestContextSetUp testContextSetup;
//Single responsibility principle
//loosely coupled 
//Factory design Pattern
	
	public offersPageStepDefinitions(TestContextSetUp testContextSetup) {
		this.testContextSetup=testContextSetup;
	}

@Then ("^User go and sarch for (.+) shortname in offers Page to check if product exist$")
public void User_go_and_search_for_same_shortname_in_offers_Page_to_check_if_product_exist(String shortName) throws Throwable {
	
	SwitchToOfferPage();
	 OffersPage offerPage = new  OffersPage(testContextSetup.driver);
	 offerPage.searchItem(shortName);
		Thread.sleep(5000);
		String offerPageProductName = offerPage.getProductNmae();
}

public void SwitchToOfferPage() throws Throwable {
	
	//if(testContextSetup.driver.getCurrentUrl().equals("https://rahulshettyacademy.com/seleniumPractise/#/"))
	//to skip if already on page 
	
	LandingPage landingPage = testContextSetup.pageObjectManager.getLandingPage();
	landingPage.selectTopDealsPage();
	Thread.sleep(5000);
	Set<String> windows = testContextSetup.driver.getWindowHandles();
	String parentWindow = testContextSetup.driver.getWindowHandle();
	for(String wind:windows) {
		String title = testContextSetup.driver.switchTo().window(wind).getTitle();
		String expected ="offers";
		if(title.contains(expected)) {
			testContextSetup.driver.switchTo().window(wind);
			break;
		}
	}
}

@Then ("validate product name in offers page matches with Landing page")
public void validate_product_name_in_offers_page_matches_with_Landing_page() {
	Assert.assertEquals(offerPageProductName, LandingPageproductName);
}

}
