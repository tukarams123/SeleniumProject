package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QAClickHomePage {
	@FindBy(linkText = "Courses")
	private WebElement courses;
	WebDriver driver;
	
	public QAClickHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void verifyQAClickHomePageTitle()
	{
		String actTitle=driver.getTitle();
		String expTitle=" ";
		if(actTitle.equals(expTitle))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	
	public void clickQAClickHomePageCourses()
	{
		courses.click();
	}

}
