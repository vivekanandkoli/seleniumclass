package org.kale.rediff.sdk.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver dr) {
		driver = dr;
	}

	/**
	 * This method is used to login to rediff
	 *
	 * @param username username of rediff user
	 * @param password password of rediff user
	 */
	public void login (String username, String password) {
		driver.findElement(By.id("login1")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.name("proceed")).click();
	}

	public boolean checkErrorMessage(String expectedMessage) {
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		try {
			String actualMessage =
					driver.findElement(By.className("heading")).getText();

			return actualMessage.equals(expectedMessage);
		} catch (Exception e) {
			return false;
		} finally {
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
	}

	public void forgotPassword() {

	}

	public void createAnAccount() {

	}
}
