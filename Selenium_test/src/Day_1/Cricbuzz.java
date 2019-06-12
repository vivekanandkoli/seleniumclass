package Day_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.media.webkitMediaStream;

public class Cricbuzz
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium_Class\\Java downloads\\chromedriverpath\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/21564/sind-vs-ma-24th-match-qualifier-t10-league-2018");
		
		List<WebElement> all=driver.findElements(By.xpath(".//*[@class='cb-col cb-col-27 ']/..//div"));
		String[] text=new String[all.size()];
		
		// Batsman
		
		List<WebElement>batsman = driver.findElements(By.xpath("//div[@class = 'cb-col cb-col-27 ']"));
		List<WebElement>Des = driver.findElements(By.xpath("//div[@class = 'cb-col cb-col-27 ']/..//span"));
		List<WebElement>R = driver.findElements(By.xpath("//div[(@class = 'cb-col cb-col-8 text-right text-bold')]"));
		List<WebElement>B = driver.findElements(By.xpath("//div[(@class = 'cb-col cb-col-8 text-right')]"));
		List<WebElement>S4 = driver.findElements(By.xpath("//div[(@class = 'cb-col cb-col-8 text-right')][2]"));
		List<WebElement>S6 = driver.findElements(By.xpath("//div[@class = 'cb-col cb-col-27 ']/..//span"));
		List<WebElement>SR = driver.findElements(By.xpath("//div[@class = 'cb-col cb-col-27 ']/..//span"));
		
		int x = 0;
		
		int y = all.size();
		
		//for(x= 0;x<=y;p++)
		{
			int z = 1;
			for(WebElement we : all) 
				{
				
				text[x] = we.getText();
				System.out.print( "  "+text[x]);
				
				int p =z%7;
				if(p == 0)
				{
					System.out.println("");
					
				}
				z++;
				}
				driver.close();
			
		}


	}

}
