package handling_dynamic_elements;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTheRatingInStarsFromFlipkart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://www.flipkart.com/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		//Thread.sleep(10000);

		// Enter shoes in search bar
		 WebElement shoes = d.findElement(By.xpath("//input[@class='Pke_EE']"));
		 shoes.sendKeys("shoes");

		// Click ENTER button
		 shoes.sendKeys(Keys.ENTER);
		 
		//Click on first shoes
		 d.findElement(By.partialLinkText("BARLEY Running")).click();
		 
		 //switching window
		 Set<String> ids = d.getWindowHandles();
		 ArrayList<String> al=new ArrayList<String>(ids);
		 String mainPageId=al.get(0);
		 String childPageId = al.get(1);
		 
		 d.switchTo().window(childPageId);
		 Thread.sleep(10000);
		 String ratings = d.findElement(By.xpath("((//div[@class='_1YokD2 _2GoDe3'])[1]//span/div)[1]")).getText();
		 System.out.println("Count in stars: "+ratings);
		 
		 d.switchTo().window(mainPageId);

		
	}

}
