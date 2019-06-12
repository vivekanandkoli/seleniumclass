package Day3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Aleartshandle {

	public static void main(String[] args) {


		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");

		driver.switchTo().frame("iframeResult");

		driver.findElement(By.xpath("//button[text()='Try it']")).click();

		Alert alert = driver.switchTo().alert();

		System.out.println(alert.getText());

		alert.dismiss();


		System.out.println(driver.findElement(By.id("demo")).getText());

//		alert.accept();





	}
}
