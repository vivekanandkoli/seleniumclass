package Day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseover {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium_Class\\Java downloads\\chromedriverpath\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();

		driver.get("http://jqueryui.com/");
		
		WebElement contribute=driver.findElement(By.xpath("//a[contains(text(),'Contribute')]"));
		
		Actions action=new Actions(driver);
		
		action.moveToElement(contribute).build().perform();
		
		action.click(driver.findElement(By.xpath("//a[contains(text(),'Code')]"))).build().perform();
		
		System.out.println(driver.getTitle());
		
		driver.close();
	}

}
