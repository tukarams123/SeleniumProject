package autosuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RahulShettyAcademyAutoSuggestionPractice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		d.manage().window().maximize();
		Thread.sleep(2000);
		String expText="French Guiana";
		d.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("fr");
		Thread.sleep(2000);
		  
		List<WebElement> allOptions = d.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		for(WebElement option:allOptions)
		{
			String actText=option.getText();
			if(actText.equalsIgnoreCase(expText))
			{
				option.click();
				break;
			}
		}

		
	}
}
