package Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) {



		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);



		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");


		WebDriverWait wd = new WebDriverWait(driver, 5);
		wd.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Create a new account"))));


		driver.findElement(By.linkText("Create a new account")).click();

		// IMplicit wait





	}
}
