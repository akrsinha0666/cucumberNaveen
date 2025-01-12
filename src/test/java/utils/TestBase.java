package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class TestBase {

	public WebDriver driver;
	
	public WebDriver webDriverManager() throws Throwable {
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") +"src\\test\\resources\\global.properties");
		Properties prop = new Properties();
		
		prop .load(fis);
		String url = prop.getProperty("QAUrl");
		
		if(driver==null) {
			
			
			if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
		
			}
			if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
				
	}
		driver.get(url);
	}
		return driver;
}
}
