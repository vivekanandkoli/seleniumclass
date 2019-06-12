package Day4;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadingFileUsingRObot {

	public static void main(String[] args) throws AWTException, InterruptedException {


		WebDriver driver = new FirefoxDriver();

		driver.get("http://spreadsheetpage.com/index.php/file/C35/P10/");



		driver.findElement(By.linkText("animatedcolors.xlsm")).click();


		Thread.sleep(1000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);





	}
}
