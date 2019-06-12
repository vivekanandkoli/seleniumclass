package org.kale.rediff.tests;

import org.kale.rediff.sdk.BaseClass;
import org.kale.rediff.sdk.pages.LoginPage;
import org.kale.rediff.sdk.utils.Verify;
import org.testng.annotations.Test;

public class InvalidLogin extends BaseClass{

	String username = "akshayseleniumsd";
	String password = "password";
	String expectedMessage = "Wrong username and password combination";


	@Test
	public void loginToRediff() {
		LoginPage lp = new LoginPage(driver);
		lp.login(username, password);

		boolean result = lp.checkErrorMessage(expectedMessage);

		Verify.checkPoint(
				result, "Correct error messsage '" + expectedMessage + "' is displayed on invalid login");
	}

}
