package Day4;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DownloadFileUsingRObot2 {

	public static void main(String[] args) throws AWTException, InterruptedException {


		WebDriver driver = new FirefoxDriver();

		driver.get("http://jkorpela.fi/forms/file.html");

		driver.findElement(By.name("datafile")).click();
		Thread.sleep(1000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_C);
		//robot.keyRelease(KeyEvent.VK_C);
//		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_SLASH);
//		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_PERIOD);
//		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_J);
//		Thread.sleep(1000);

		robot.keyPress(KeyEvent.VK_ENTER);





	}
}
