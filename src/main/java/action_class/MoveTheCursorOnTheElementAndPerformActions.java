package action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveTheCursorOnTheElementAndPerformActions {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://www.ebay.com/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();

		WebElement motors = d.findElement(By.xpath("//a[text()='Motors']"));
		
		Actions act=new Actions(d);
		act.moveToElement(motors).perform();
		
		d.findElement(By.xpath("//a[text()='Motorcycle parts']")).click();

	}
}
