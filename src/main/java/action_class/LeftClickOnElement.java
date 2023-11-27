package action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LeftClickOnElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://www.amazon.com/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement sell = d.findElement(By.xpath("//a[text()='Sell']"));

		Actions act = new Actions(d);
//		act.moveToElement(sell).perform();
//		act.click().perform();
		
//		act.moveToElement(sell).click().perform();
		
		act.click(sell).perform();


	}

}
