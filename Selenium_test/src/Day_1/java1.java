package Day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.gargoylesoftware.htmlunit.javascript.host.canvas.ext.WEBGL_compressed_texture_s3tc;

public class java1
{

	public static void main(String[] args)
	{
		
		
//		System.setProperty("webdriver.ie.driver","E:\\Selenium_Class\\Java downloads\\IEdriverpath\\IEDriverServer.exe");
//		InternetExplorerDriver driver=new InternetExplorerDriver(); 
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium_Class\\Java downloads\\chromedriverpath\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.id("login1")).sendKeys("vivekseleniumtest");
		
		driver.findElement(By.id("password")).sendKeys("kale_123");
		driver.findElement(By.name("proceed")).click();
		
		driver.findElement(By.className("rd_setting_panel")).click();
		driver.findElement(By.xpath("html/body/div[4]/div[1]/div/div[2]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("html/body/div[4]/div[1]/div/div[2]/ul/li[3]/ul/li[3]/a")).click();
		
		driver.findElement(By.name("displayname")).clear();
		driver.findElement(By.name("displayname")).sendKeys("seleniium vivek");
		driver.findElement(By.id("submit2")).click();
		
		
		driver.findElement(By.className("rd_logout")).click();
		
		String Display_Name=driver.findElement(By.xpath("html/body/div[4]/div[1]/div/div[2]/span/cite/a")).getText();
		
	//	driver.findElement(By.xpath(xpathExpression))
	
	}

}
