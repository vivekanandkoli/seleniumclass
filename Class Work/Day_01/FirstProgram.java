package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstProgram {

	public static void main(String[] args) {

		// This is used to launch FF
		// WebDriver - in an interface
		// driver - object/instance
		// FirefoxDriver - it is a class

		WebDriver driver = new FirefoxDriver();

//		driver.get("");

		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");



		// By is a class
		// id is method of By class
		// findElement is a method in WebDriver, which returns WebElement
		WebElement login = driver.findElement(By.id("login1"));

		login.sendKeys("test");

		driver.findElement(By.id("password")).sendKeys("test");

		driver.findElement(By.name("proceed")).click();


//		driver.close();
		//driver.quit();





	}

}
