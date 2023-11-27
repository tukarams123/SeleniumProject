package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_1_Normal_TestClass {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://id.heroku.com/login");
		d.manage().window().maximize();
		Thread.sleep(2000);
		d.quit();
	}
}
