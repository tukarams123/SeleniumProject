package scenario_based_questions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTheTextOfAllTheImagesPresentInWebpage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d=new ChromeDriver();
		d.get("https://www.rahulshettyacademy.com/");
		
		List<WebElement> allImages = d.findElements(By.xpath("//img"));
		for(WebElement images:allImages)
		{
			System.out.println(images.getTagName());
		}
		
		

	}

}
