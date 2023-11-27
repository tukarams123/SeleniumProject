package POM_With_TestNG_Base_UtilityClass_FailedTCSS;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class {
	WebDriver d;

	public void initializeBrowser() {
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://www.saucedemo.com/");

	}

}
