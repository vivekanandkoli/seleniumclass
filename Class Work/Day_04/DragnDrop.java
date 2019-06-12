package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDrop {

	public static void main(String[] args) {


		WebDriver driver = new FirefoxDriver();

		driver.get("http://jqueryui.com/draggable/");

		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

		WebElement elementToDrag = driver.findElement(By.id("draggable"));

		int x = elementToDrag.getLocation().x;
		int y = elementToDrag.getLocation().y;

		System.out.println("X and Y before dragging : " + x + " -- " + y);


		Actions action = new Actions(driver);

		action.dragAndDropBy(elementToDrag, 100, 100).build().perform();

		x = elementToDrag.getLocation().x;
		y = elementToDrag.getLocation().y;

		System.out.println("X and Y after dragging : " + x + " -- " + y);

//		action.clickAndHold(elementToDrag).moveByOffset(100, 100).release().perform();


	}
}
