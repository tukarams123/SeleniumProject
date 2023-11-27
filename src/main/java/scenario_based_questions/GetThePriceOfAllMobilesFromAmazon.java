package scenario_based_questions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetThePriceOfAllMobilesFromAmazon {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://www.amazon.com/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		//Thread.sleep(10000);

		// Enter mobile name in search bar
		d.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Redmi note 10");

		// Click on search button
		d.findElement(By.xpath("//input[@value='Go']")).click();
		
		//Get the price of all the mobiles
		List<WebElement> allPrices = d.findElements(By.xpath("//span[@class='a-price']"));
		int countOfPrice=allPrices.size();
		System.out.println("Count of all prices: "+countOfPrice);
		
		System.out.println("----Price of each mobiles----");
		for(WebElement price:allPrices)
		{
			String priceOfMobile=price.getText();
			System.out.println(priceOfMobile);
		}



	}

}
