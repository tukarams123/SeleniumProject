package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QAClickCoursesPage {
	@FindBy(xpath = "//span[text()='Sign up']")
	private WebElement signUp;
	
	public QAClickCoursesPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickQAClickCoursesPageSignUp()
	{
		signUp.click();
	}

}
