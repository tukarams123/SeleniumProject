package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_HeadLess_Chrome_Browser {
	@Test
	public void verifyTitle() throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("headless");
		WebDriver d = new ChromeDriver(options);
		d.get("https://id.heroku.com/login");
		String actTitle=d.getTitle();
		String expTitle="Heroku | Login";
		Assert.assertEquals(actTitle, expTitle,"Failed:both results are different");
		d.quit();
	}
}
