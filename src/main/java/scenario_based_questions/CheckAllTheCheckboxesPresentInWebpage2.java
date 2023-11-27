package scenario_based_questions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckAllTheCheckboxesPresentInWebpage2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d=new ChromeDriver();
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> allCheckboxes = d.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement checkboxes:allCheckboxes)
		{
			checkboxes.click();
			Thread.sleep(1000);
		}
		for(int i=allCheckboxes.size();i>=1;i--)
		{
			for(WebElement checkboxes:allCheckboxes)
			{
				checkboxes.click();
				Thread.sleep(1000);
			}
		}

	}

}
