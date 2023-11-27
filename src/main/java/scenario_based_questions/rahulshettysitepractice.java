package scenario_based_questions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class rahulshettysitepractice {

	public static void main(String[] args) throws InterruptedException {

		WebDriver d = new ChromeDriver();
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Select class
		WebElement dropdown = d.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select s = new Select(dropdown);
		s.selectByIndex(1);

		// isSelected()
		boolean radioBtn = d.findElement(By.xpath("//label[@for='radio1']")).isSelected();
		System.out.println(radioBtn);

		// check all the radio buttons one by one
		List<WebElement> radios = d.findElements(By.xpath("//input[@type='radio']"));
		int size = radios.size();
		System.out.println("Count of radio buttons: " + size);

		for (WebElement radio : radios) {
			radio.click();
		}

	}

}
