package action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDragAndDropClickAndHoldRelease {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("http://demo.guru99.com/test/drag_drop.html");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		
		
		WebElement src = d.findElement(By.xpath(" //a[text()=' 5000 '] "));
		WebElement dest = d.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		Actions act=new Actions(d);
//		act.dragAndDrop(src, dest).perform();
//		
//		act.moveToElement(src).clickAndHold().moveToElement(dest).release().perform();
		
		act.clickAndHold(src).moveToElement(dest).release().perform();
		
	}

}
