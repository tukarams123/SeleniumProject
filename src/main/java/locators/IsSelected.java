package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		WebElement result = driver.findElement(By.xpath("//label[text()='Male']"));
		result.click();
		Thread.sleep(5000);

		boolean male=result.isSelected();
		System.out.println(male);
		result.click();
		boolean male2=result.isSelected();
		System.out.println(male2);


		

		/*if (result) {
			System.out.println("male radio button is selected");

		} else {
			Thread.sleep(5000);
			driver.findElement(By.xpath("//label[text()='Male']")).click();
			boolean result2=driver.findElement(By.xpath("//label[text()='Male']")).isSelected();
			System.out.println(result2);

		}*/

	}
}
