package autosuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://demo.automationtesting.in/AutoComplete.html");
		d.manage().window().maximize();
		Thread.sleep(2000);
		String expText="Australia";

		d.findElement(By.xpath("//input[@id='searchbox']")).sendKeys("aus");
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
