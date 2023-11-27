package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		FacebookHomePage home = new FacebookHomePage(driver);
		home.getFacebookHomePageHeading();
		Thread.sleep(2000);
		home.verifyFacebookHomePageTitle();
		Thread.sleep(2000);
		home.clickFacebookHomePageCreateNewAcc();
		Thread.sleep(2000);

		FacebookSignUpPage sign=new FacebookSignUpPage(driver);
		sign.inpFacebookSignUpPageFirstName();
		Thread.sleep(2000);
		sign.inpFacebookSignUpPageSurName();
		Thread.sleep(2000);
		sign.inpFacebookSignUpPageMobNo();
		Thread.sleep(2000);
		sign.inpFacebookSignUpPagePassword();
		Thread.sleep(2000);
		sign.clickFacebookSignUpPageMaleBtn();
		Thread.sleep(2000);
		sign.clickFacebookSignUpPageSignUp();
		Thread.sleep(2000);
		driver.quit();


	}

}
