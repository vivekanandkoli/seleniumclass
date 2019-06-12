package org.kale.rediff.tests;

import org.kale.rediff.sdk.BaseClass;
import org.kale.rediff.sdk.pages.HomePage;
import org.kale.rediff.sdk.pages.LoginPage;
import org.kale.rediff.sdk.testdataReaders.TestDataCollection;
import org.kale.rediff.sdk.testdataReaders.TestDataReader;
import org.kale.rediff.sdk.testdataReaders.TestDataReaderFactory;
import org.kale.rediff.sdk.utils.Verify;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ValidLogin extends BaseClass{

	String username;
	String password;
	String expectedName;

	// 1. Put another test case of valid login .
	// 2. cleanup this code.
	// 3. Read data from yml
	@BeforeClass
	public void readData() {
		TestDataReader tdr =
				TestDataReaderFactory.getInstance().open("test-data\\user-accounts.yml");
		TestDataCollection tdc = tdr.getCollection("login1");
		username =tdc.getString("email");
		password = tdc.getString("password");
		expectedName = tdc.getString("fullName");
	}

	@Test
	public void loginToRediff() {
		LoginPage lp = new LoginPage(driver);
		lp.login(username, password);

		HomePage hp = new HomePage(driver);
		boolean result = hp.checkDisplayName(expectedName);

		Verify.checkPoint(
				result, "Correct username '" + expectedName + "' is displayed");
	}

}
