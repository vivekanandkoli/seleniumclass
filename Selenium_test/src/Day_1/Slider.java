package Day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider 
{

	public static void main(String[] args)
	{
	
		System.setProperty("webdriver.chrome.driver","E:\\Selenium_Class\\Java downloads\\chromedriverpath\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();

		driver.get("http://jqueryui.com/slider/");
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		WebElement slide_element=driver.findElement(By.xpath("//span[contains(@class,'ui-state-default')]"));
		
		Actions action =new Actions(driver);
		
		int x = slide_element.getLocation().x;
		int y = slide_element.getLocation().y;
		
		System.out.println("X and Y before slidding  : " + x + " -- " + y);
		
		action.dragAndDropBy(slide_element,100,100).clickAndHold().perform();
		
		 x = slide_element.getLocation().x;
		 y = slide_element.getLocation().y;
		
		 System.out.println("X and Y After slidding  : " + x + " -- " + y);
		
	}

}
