package Day_1;

import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cricbuzz_test01 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium_Class\\Java downloads\\chromedriverpath\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/21564/sind-vs-ma-24th-match-qualifier-t10-league-2018");
		
		List<WebElement> Table_Scrbrd=driver.findElements(By.id("id='innings_1"));
		int p=Table_Scrbrd.size();
	
		
		
		
		for(int x=3;x<=8;x++)
		{
			WebElement Batsman_Name=driver.findElement(By.xpath(".//*[@id='innings_1']/div[1]/div["+x+"]/div[1]/a"));
			System.out.println(Batsman_Name.getText());	
		}
		
		driver.close();
	}

}
