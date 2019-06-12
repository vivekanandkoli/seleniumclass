package org.kale.rediff.sdk.utils;

import org.testng.Assert;
import org.testng.Reporter;

public class Verify {

	public static void checkPoint(boolean result , String message) {

		// Try to change this if code into just 1 line of code.
		if(result) {
			message = message + " : Pass";
		} else {
			message = message + " : Fail";
		}

		Reporter.log(message);
		Assert.assertTrue(result, message);
	}

}
