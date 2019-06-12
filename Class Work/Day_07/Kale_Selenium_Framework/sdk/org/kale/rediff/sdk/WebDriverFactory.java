package org.kale.rediff.sdk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * This class is responsible for creating driver
 *
 * @author Kale
 */
public class WebDriverFactory {

	WebDriver driver;

	public WebDriver getDriver(String browser) {
		if(browser.equals("Firefox")) {
			driver = new FirefoxDriver();
		} else {
			System.setProperty("webdriver.chrome.driver", "executables\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		return driver;
	}



}
