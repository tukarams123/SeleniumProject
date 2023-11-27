package action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveTheCursorOnTheElementAndPerformActions2 {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://www.amazon.com/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();

		WebElement accAndList = d.findElement(By.xpath("//span[text()='Account & Lists']"));

		Actions act = new Actions(d);
		act.moveToElement(accAndList).perform();
		d.findElement(By.xpath("//span[text()='Recommendations']")).click();

		WebElement language = d.findElement(By.xpath("//div[text()='EN']"));
		act.moveToElement(language).perform();
		d.findElement(By.xpath("//span[text()='English']")).click();

	}
}
