package Day_1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UplaodingFile
{
	public static void main(String[] args) throws IOException
	{
	System.setProperty("webdriver.chrome.driver","E:\\Selenium_Class\\Java downloads\\chromedriverpath\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("http://jkorpela.fi/forms/file.html");
	
	driver.findElement(By.name("datafile")).click();
	
	Runtime.getRuntime().exec("E:\\Selenium_Class\\Auto_IT\\File_Selector.exe");

	}
}
