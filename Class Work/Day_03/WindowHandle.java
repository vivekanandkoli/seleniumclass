package Day3;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandle {

	public static void main(String[] args) {


		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open");

		String mainWindow = driver.getWindowHandle();

		driver.switchTo().frame("iframeResult");

		driver.findElement(By.xpath("//button[text()='Try it']")).click();

		Set<String> allWindows = driver.getWindowHandles();

		System.out.println("no of opened windows : "+allWindows.size());

		for(String window : allWindows) {
			driver.switchTo().window(window);
		}

		System.out.println(driver.findElement(By.className("w3-right")).getText());

		driver.close();

		driver.switchTo().window(mainWindow);

		System.out.println(driver.findElement(By.id("framesize")).getText());

	}
}
