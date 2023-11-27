package youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
    	Thread.sleep(3000);

		WebElement search=driver.findElement(By.name("search_query"));
		search.click();
		Thread.sleep(3000);

		search.sendKeys("humnava");
		Thread.sleep(5000);
		search.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Humnava Full Video")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@title='Full screen (f)']")).click();


		
		//driver.findElement(By.className("yt-spec-icon-shape")).click();

		
		

	}
}
