package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QAClickSignUpPage {
	@FindBy(name = "fullname")
	private WebElement fullName;
	@FindBy(xpath = "//input[@name='email']")
	private WebElement email;
	@FindBy(xpath = "//input[@name='password']")
	private WebElement pswd;
	@FindBy(xpath = "(//span[text()='Sign up'])[2]")
	private WebElement signUp;
	
	public QAClickSignUpPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inpQAClickSignUpPageFullName()
	{
		fullName.sendKeys("Somnath Shinde");
	}
	
	public void inpQAClickSignUpPageEmail()
	{
		email.sendKeys("tukaram.shinde19@vit.edu");
	}
	
	public void inpQAClickSignUpPagePassWord()
	{
		pswd.sendKeys("Aa2*Aa2*");
	}
	
	public void clickQAClickSignUpPageSignUp()
	{
		signUp.click();
	}


}
