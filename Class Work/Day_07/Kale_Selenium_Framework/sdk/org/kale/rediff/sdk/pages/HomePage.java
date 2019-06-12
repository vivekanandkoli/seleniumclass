package org.kale.rediff.sdk.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver dr) {
		driver = dr;
	}


	/**
	 * THis will check the name of logged in user
	 *
	 * @param expectedName expected name that should be displayed
	 * @return true if name is correct else false
	 */
	public boolean checkDisplayName(String expectedName) {
		String actualName =
				driver.findElement(By.className("rd_usr_log")).getText();
		return actualName.equals(expectedName);
	}



}
