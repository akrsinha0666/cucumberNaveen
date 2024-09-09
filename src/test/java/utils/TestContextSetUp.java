package utils;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TestContextSetUp {
	public WebDriver driver ;
	public String LandingPageproductName;
	public PageObjectManager pageObjectManager;
	public TestBase testBase;
	public GenericUtils genericUtils;
	
public TestContextSetUp() {
	 testBase= new TestBase();
	  genericUtils= new GenericUtils(driver);
	pageObjectManager= new PageObjectManager(testBase.driver);
}
}
