package scenario_based_questions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckAllTheCheckboxesInReverseOrder {

	public static void main(String[] args) throws InterruptedException {

		WebDriver d = new ChromeDriver();
		d.get("file:///C:/Users/admin/Desktop/MultipleCheckbox.html");

		List<WebElement> allCheckboxes = d.findElements(By.xpath("//input[@type='checkbox']"));
		for (WebElement checkboxes : allCheckboxes) {
			checkboxes.click();
			Thread.sleep(1000);

		}
//		for (WebElement checkboxes : allCheckboxes) {
//			checkboxes.click();
//			Thread.sleep(1000);
//
//		}

		for (int i = allCheckboxes.size()-1; i >= 0; i--) {
			allCheckboxes.get(i).click();
			Thread.sleep(1000);

		}
//		d.quit();
	}
}