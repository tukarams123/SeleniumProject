package action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LeftClickOnElement2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://www.ebay.com/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		// Thread.sleep(10000);
		
		WebElement saved = d.findElement(By.xpath("//a[text()='Saved']"));
		
		Actions act=new Actions(d);
//		act.moveToElement(saved).perform();
//		act.click().perform();
//		
//		act.moveToElement(saved).click().perform();
		
		act.click(saved).perform();
	}

}
