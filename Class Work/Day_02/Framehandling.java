package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Framehandling {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_form_submit");

		driver.switchTo().frame("iframeResult");

		WebElement fName = driver.findElement(By.name("FirstName"));
		fName.clear();
		fName.sendKeys("selenium");

		WebElement lName = driver.findElement(By.name("LastName"));
		lName.clear();
		lName.sendKeys("qa");

		driver.findElement(By.xpath("//input[@value='Submit']")).click();

		driver.switchTo().defaultContent();

		System.out.println(driver.findElement(By.id("framesize")).getText());




	}
}
