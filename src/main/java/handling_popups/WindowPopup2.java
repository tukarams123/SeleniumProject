package handling_popups;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopup2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// type Iphone 15 in search box
		d.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("Iphone 15");

		// click on search button
		d.findElement(By.xpath("//input[@value='Go']")).click();

		// select the phone
		d.findElement(By.xpath("//span[text()='Apple iPhone 15 (128 GB) - Blue']")).click();

		// get the window id of all the windows
		Set<String> ids = d.getWindowHandles();

		// convert Set to ArrayList to get the window id of each window
		ArrayList<String> a1 = new ArrayList<String>(ids);

		// get the window id of mainwindow using get() method
		String mainWindow = a1.get(0);

		// get the window id of childwindow using get() method
		String childWindow = a1.get(1);

		// switch control from mainWindow to childWindow
		d.switchTo().window(childWindow);

		// perform actions on childWindow
		d.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();

		Thread.sleep(2000);
		// click on skip button
		d.findElement(By.xpath("//input[@aria-labelledby='attachSiNoCoverage-announce']")).click();

		// switch control from childWindow to mainWindow
		d.switchTo().window(mainWindow);

	}

}
