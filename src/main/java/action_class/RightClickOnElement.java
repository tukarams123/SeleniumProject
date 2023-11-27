package action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickOnElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://www.amazon.com/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		// Thread.sleep(10000);
		WebElement location = d.findElement(By.xpath("//span[@class='a-button-text']"));

		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("arguments[0].click()", location);
		WebElement custService = d.findElement(By.xpath("//a[text()='Customer Service']"));

		Actions act = new Actions(d);
//      Approach 1
//		act.moveToElement(custService).perform();
//		act.contextClick().perform();

//      Approach 2
//      act.moveToElement(custService).contextClick().perform();

//      Approach 3
		act.contextClick(custService).perform();

	}

}
