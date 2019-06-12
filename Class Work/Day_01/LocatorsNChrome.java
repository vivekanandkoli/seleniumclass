package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsNChrome {

	public static void main(String[] args) {

		// No. of locators

		// 1. ID
		// 2. Name
		// 3. ClassName
		// 4. LinkText
		// 5. PartialLinkText
		// 6. TagName
		// 7. CssSelector
		// 8. Xpath
		// 9. DOM

		System.setProperty("webdriver.chrome.driver", "D:/selenium\\chromedriver_2_40\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");

		WebElement login = driver.findElement(By.id("login1"));
		login.sendKeys("akshayselenium");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.name("proceed")).click();

		String name = driver.findElement(By.className("rd_usr_log")).getText();

		System.out.println(name);



	}
}
