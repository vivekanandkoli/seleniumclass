package Day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.gargoylesoftware.htmlunit.javascript.host.media.webkitMediaStream;
import com.sun.corba.se.spi.orbutil.fsm.Action;

public class Dragndrop 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium_Class\\Java downloads\\chromedriverpath\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();

		driver.get("http://jqueryui.com/droppable/");
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		WebElement Elementdrag=driver.findElement(By.id("draggable"));
		
		WebElement elementdragtarget=driver.findElement(By.id("droppable"));
		
		Actions action =new Actions(driver);
		
		action.dragAndDrop(Elementdrag, elementdragtarget).build().perform();
		
		System.out.println("complete");
	}

}
