package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadingFile {

	public static void main(String[] args) {


		WebDriver driver = new FirefoxDriver();

		driver.get("http://jkorpela.fi/forms/file.html");

		driver.findElement(By.name("datafile")).sendKeys("C:\\Users\\User\\Desktop\\test\\FirstClass.java");



	}
}
