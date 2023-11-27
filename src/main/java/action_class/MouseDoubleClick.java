package action_class;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://demo.guru99.com/test/simple_context_menu.html");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		
		WebElement dblClick = d.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions act=new Actions(d);
//		act.moveToElement(dblClick).perform();
//		act.doubleClick().perform();
//		
//		act.moveToElement(dblClick).doubleClick().perform();
		
		act.doubleClick(dblClick).perform();
		Thread.sleep(2000);

		Alert alt = d.switchTo().alert();
		Thread.sleep(2000);
		alt.accept();
		
	}

}
