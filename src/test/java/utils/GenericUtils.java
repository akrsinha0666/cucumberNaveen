package utils;

import java.util.Set;

import org.openqa.selenium.WebDriver;
 
public class GenericUtils {
	public WebDriver driver;
	
	public GenericUtils (WebDriver driver) {
		this.driver=driver;
	}
	public void SwitchToOfferPage() {
	Set<String> windows =driver.getWindowHandles();
	String parentWindow = driver.getWindowHandle();
	for(String wind:windows) {
		String title = driver.switchTo().window(wind).getTitle();
		String expected ="offers";
		if(title.contains(expected)) {
			driver.switchTo().window(wind);
			break;
		}
	}
}
}
