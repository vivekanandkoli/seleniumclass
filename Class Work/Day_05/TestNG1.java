package TestngSesssion;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG1 {

	// Testng is a testing framework which consists of Annotations

	// Test : Test case
	// BeforeMethod: annotation which will be executed before every @Test
	// AfterMethod : after every @Test
	// BeforeClass : Before class
	// AfterClass : After class
	// BeforeTest
	// AfterTest
	// BeforeSuite
	// AfterSuite

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}


	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}

	@Test
	public void firstTest() {
		System.out.println("First Test case");

	}

	@Test(dependsOnMethods = "firstTest")
	public void secondTest() {
		System.out.println("Second Test case");
	}

	@Test(dependsOnMethods = "secondTest")
	public void thirdTest() {
		System.out.println("Third Test case");
		String actualName = "Selenium";
		String expectedName = "Selenium";

		boolean result = actualName.equals(expectedName);
		String message = "Thrid test case";
		if(result) {
			message = message + " : Pass";
		} else {
			message = message + " : Fail";
		}
		Reporter.log(message);
//		Assert.assertEquals(actualName, expectedName);
		Assert.assertTrue(result);
	}

	@Test(dependsOnMethods = "thirdTest")
	public void fourthTest() {
		System.out.println("Fourth Test case");
	}

}
