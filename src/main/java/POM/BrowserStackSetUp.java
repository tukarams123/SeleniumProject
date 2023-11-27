package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserStackSetUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://www.browserstack.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		BrowserStackHomePage home = new BrowserStackHomePage(d);
		home.getBrowserStackHomePageHeading();
		home.verifyBrowserStackHomePageTitle();
		home.clickBrowserStackHomePageGetStartedFree();
		Thread.sleep(3000);

		BrowserStackSignUpPage sign = new BrowserStackSignUpPage(d);
		sign.inpBrowserStackSignUpPageFullName();
		Thread.sleep(3000);
		sign.inpBrowserStackSignUpPageBusinessEmail();
		Thread.sleep(3000);
		sign.inpBrowserStackSignUpPagePassword();
		Thread.sleep(3000);
		sign.clickBrowserStackSignUpPageTermsAndConditions();
		Thread.sleep(3000);
		sign.clickBrowserStackSignUpPageSignMeUp();
	}

}
