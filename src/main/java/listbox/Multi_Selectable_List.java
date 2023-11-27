package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_Selectable_List {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://omayo.blogspot.com/");
		Thread.sleep(2000);
		WebElement drop = driver.findElement(By.xpath("//select[@id='multiselect1']"));
		Select car = new Select(drop);
		car.selectByVisibleText("Hyundai");
		car.selectByValue("audix");
		car.selectByIndex(0);
		
		Thread.sleep(2000);
		//car.deselectAll();
		//car.deselectByVisibleText("Hyundai");
		car.deselectByValue("volvox");
		car.deselectByIndex(3);
	}

}
