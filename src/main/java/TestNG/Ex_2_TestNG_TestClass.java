package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex_2_TestNG_TestClass {
	@Test
	public void TC1() throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://id.heroku.com/login");
		d.manage().window().maximize();
		Thread.sleep(2000);
		d.quit();
	}
}
