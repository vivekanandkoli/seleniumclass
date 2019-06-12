package org.kale.rediff.sdk;

import java.util.concurrent.TimeUnit;

import org.kale.rediff.sdk.testdataReaders.PropertiesFileReader;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public WebDriver driver;
	String url, browser;

	@BeforeClass
	public void initialization() {
		PropertiesFileReader pfr = new PropertiesFileReader();
		pfr.loadPropertiesFile();
		url = pfr.getPropertyValue("url");
		browser = pfr.getPropertyValue("browser");

		WebDriverFactory wdf = new WebDriverFactory();
		driver = wdf.getDriver(browser);
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
