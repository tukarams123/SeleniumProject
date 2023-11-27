package handling_dynamic_elements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTheRatingInNumbersFromAmazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://www.amazon.com/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		Thread.sleep(10000);

		// Enter mobile name in search bar
		d.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Redmi note 10");

		// Click on search button
		d.findElement(By.xpath("//input[@value='Go']")).click();

		// Select the third mobile from list and gets it rating numbers by using it's
		// parent and traverse to any child
		String ratings = d.findElement(By.xpath("((//div[@class='puisg-row'])[3]//span)[6]")).getText();
		System.out.println("Rating numbers: "+ratings);

	}

}
