package autosuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutosuggestion {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
		d.get("https://www.google.com/");
		d.manage().window().maximize();
		Thread.sleep(2000);
		String expectedText="redmi 12 5g";

		d.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("redmi");
		Thread.sleep(2000);
		
		List<WebElement> options = d.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		
		for(WebElement option:options)
		{
			String actualText=option.getText();
			if(actualText.equalsIgnoreCase(expectedText))
			{
				option.click();
				break;
			}
		}

		
	}

}
