package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {

	public static void main(String[] args) {


		WebDriver driver = new FirefoxDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.linkText("Create a new account")).click();


		WebElement DayDD =
				driver.findElement(By.xpath("//select[contains(@name,'DOB_Day')]"));



		Select select = new Select(DayDD);

		select.selectByVisibleText("07");









	}
}
