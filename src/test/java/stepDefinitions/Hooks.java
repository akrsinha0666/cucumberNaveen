package stepDefinitions;

import io.cucumber.java.After;
import utils.TestContextSetUp;

public class Hooks {
	TestContextSetUp testContextSetUp;
	public Hooks(TestContextSetUp testContextSetUp) {
		 
		this.testContextSetUp=testContextSetUp;
	}
	@After
	public void AfterSceanrio() throws Throwable {
		testContextSetUp.testBase.webDriverManager().quit();
		
	}
} 
