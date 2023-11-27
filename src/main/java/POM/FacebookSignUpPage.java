package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookSignUpPage {

	@FindBy(name = "firstname")
	private WebElement firstName;
	@FindBy(name = "lastname")
	private WebElement surName;
	@FindBy(name = "reg_email__")
	private WebElement mobNo;
	@FindBy(name = "reg_passwd__")
	private WebElement pswd;
	@FindBy(xpath = "(//input[@class='_8esa'])[2]")
	private WebElement gender;
	@FindBy(name = "websubmit")
	private WebElement signUp;

	
	public FacebookSignUpPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inpFacebookSignUpPageFirstName()
	{
		firstName.sendKeys("Somnath");
	}
	
	public void inpFacebookSignUpPageSurName()
	{
		surName.sendKeys("Kadam");
	}

	public void inpFacebookSignUpPageMobNo()
	{
		mobNo.sendKeys("9834835403");
	}
	
	public void inpFacebookSignUpPagePassword()
	{
		pswd.sendKeys("Aa2*Aa2*");
	}
	
	public void clickFacebookSignUpPageMaleBtn()
	{
		gender.click();
	}
	
	public void clickFacebookSignUpPageSignUp()
	{
		signUp.click();
	}
}
