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

public class LandingPageStepDefinitions {
	
	public WebDriver driver ;
	public String LandingPageproductName;
	public String offerPageProductName;
	TestContextSetUp testContextSetup;
	LandingPage landingPage;
	public LandingPageStepDefinitions(TestContextSetUp testContextSetup) {
		this.testContextSetup=testContextSetup;
	}
	
@Given("user is on GreenCart Landing page")
public void user_is_on_GreenCart_Landing_page() {
	
	//System.setProperty("WebDriver.chrome.driver","path to be dowlonaded from chrome version and usee it ");
//	testContextSetup.driver = new ChromeDriver();
//	testContextSetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

}


@When("^user searched with Shortname(.+) and extarcted actual name of product$")
public void user_searched_with_Shortname_and_extarcted_actual_name_of_product(String shortName) {
	LandingPage landingPage = testContextSetup.pageObjectManager.getLandingPage();
	
	landingPage.searchItem(shortName);
	
	testContextSetup.LandingPageproductName = landingPage.getProductNmae().split("-")[0].trim();
	System.out.println(LandingPageproductName + " product Name is extracted");
	
	
}
@When("Added int items of the selected product to cart")
	public void Added_items_product(String quantity)
	{
	 //int quantityValue = Integer.parseInt(quantity);
		landingPage.incrementQuantity(Integer.parseInt(quantity));
		landingPage.addToCart();
	}

}
