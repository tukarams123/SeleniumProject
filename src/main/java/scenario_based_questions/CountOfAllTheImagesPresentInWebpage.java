package scenario_based_questions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountOfAllTheImagesPresentInWebpage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d=new ChromeDriver();
		d.get("https://www.rahulshettyacademy.com/");
		
		List<WebElement> allImages = d.findElements(By.xpath("//img"));
		int size=allImages.size();
		System.out.println("Count of images: "+size);
		
		

	}

}
