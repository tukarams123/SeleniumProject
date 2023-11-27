package POM_With_TestNG_Base_UtilityClass_FailedTCSS_PropertyFile;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class {
	WebDriver d;

	public void initializeBrowser() throws IOException {
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get(Utility_Class.getDataFromPF("URL"));


	}

}
