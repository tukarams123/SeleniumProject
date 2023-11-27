package scenario_based_questions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAlltheLinksPresentInaWebpge {

	public static void main(String[] args) {
		
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		
		List<WebElement> allLinks = d.findElements(By.xpath("//a"));
		
		for(WebElement links:allLinks)
		{
			System.out.println(links.getText());
		}

	}

}
