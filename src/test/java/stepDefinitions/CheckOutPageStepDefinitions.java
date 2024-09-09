package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CheckOutPage;
import pageObjects.PageObjectManager;
import utils.TestContextSetUp;

public class CheckOutPageStepDefinitions<CheckOutPage> {
	
	public WebDriver driver; 
	public String offerPageProductName;
	public String  landingPageProductName;
	TestContextSetUp testContextSetUp;
	public CheckOutPage checkoutPage;
	
	public   CheckOutPageStepDefinitions( TestContextSetUp testContextSetUp)
	{
		this.testContextSetUp =testContextSetUp;
		this.checkoutPage= (CheckOutPage) ((PageObjectManager) testContextSetUp.pageObjectManager).getCheckOutPage();
	}

	@Then("verify user has ability to enter promo code and place the order")
	public void verify_user_has_ability_to_enter_promo_code_and_place_the_order()
	{
	            //checkoutPage= testContextSetUp.pageObjectManager.getCheckOutPage();
	            Assert.assertTrue(((pageObjects.CheckOutPage) checkoutPage).verifyPromoBtn());
	            Assert.assertTrue(((pageObjects.CheckOutPage) checkoutPage).VerifyPlanOrder());
	}
	    
	@Then("^User proceeds to checkout and validate the (.+) items in checkout page$")
	public void User_proceeds_to_checkout(String name) throws InterruptedException
	{
		
		Thread.sleep(2000);
	}
	}























