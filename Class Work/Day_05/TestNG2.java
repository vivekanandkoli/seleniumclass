package TestngSesssion;

import org.testng.annotations.Test;

public class TestNG2 {


	@Test
	public void login() {
	}

	@Test(dependsOnMethods = "login", priority = 1)
	public void sendFeeback() {
	}

	@Test (dependsOnMethods = "login", priority = 2)
	public void sendEmail() {
	}

	@Test (dependsOnMethods = "sendEmail")
	public void deleteEmail() {
	}

	@Test (dependsOnMethods = "deleteEmail")
	public void logout() {
	}

}
