package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	
	private static final WebDriver driver = buildDriver();
	private static String browser;

	private static WebDriver buildDriver() {
		
		//get the browser type from the config properties and initialize the Web driver accordingly
		browser = PropertiesFileFactory.getPropertyValue("browser");
		
		switch (browser) {
		
		//introduce the ignorecase
		case "Chrome":
			
			System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
			return (new ChromeDriver());
			
		case "Firefox":
			//code to open the Firefox 
			
		default:
			
			System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
			return (new ChromeDriver());
		}
		
	}
	
	public static WebDriver getDriver() {
		
		return driver;
	}
	
	public static void quitDriver() {
		
		driver.quit();
	}

}
