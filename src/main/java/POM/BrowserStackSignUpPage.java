package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrowserStackSignUpPage {
	WebDriver d;
	@FindBy(id = "user_full_name")
	private WebElement fullName;
	@FindBy(id = "user_email_login")
	private WebElement busEmail;
	@FindBy(id = "user_password")
	private WebElement pwd;
	@FindBy(name = "terms_and_conditions")
	private WebElement termsAndConditions;
	@FindBy(xpath = "//input[@value='Sign me up']")
	private WebElement signUp;

	public BrowserStackSignUpPage(WebDriver d) {
		PageFactory.initElements(d, this);
	}

	public void inpBrowserStackSignUpPageFullName() {
		fullName.sendKeys("Tukaram Shinde");
	}

	public void inpBrowserStackSignUpPageBusinessEmail() {
		busEmail.sendKeys("tukaram.shinde19@vit.edu");
	}

	public void inpBrowserStackSignUpPagePassword() {
		pwd.sendKeys("Aa1*Aa1*");
	}

	public void clickBrowserStackSignUpPageTermsAndConditions() {
//		WebDriverWait wait=new WebDriverWait(d, Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.visibilityOf(termsAndConditions));
		termsAndConditions.click();
	}

	public void clickBrowserStackSignUpPageSignMeUp() {
		signUp.click();
	}

}
