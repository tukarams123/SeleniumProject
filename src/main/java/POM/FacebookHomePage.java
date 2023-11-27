package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookHomePage {

	WebDriver driver;
	@FindBy(xpath="//a[text()='Create new account']") private WebElement createNewAcc;
	
    @FindBy(xpath="//img[@alt='Facebook']")	private WebElement heading;
    
    public FacebookHomePage(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
    
    public void getFacebookHomePageHeading()
    {
    	String text=heading.getText();
    	System.out.println(text);
    }
    
    public void verifyFacebookHomePageTitle()
    {
    	String actTitle=driver.getTitle();
    	String expTitle=" ";
    	if(actTitle.equals(expTitle))
    	{
    		System.out.println("Pass");
    	}
    	else
    	{
    		System.out.println("Pass");
    	}
    }
    
    public void clickFacebookHomePageCreateNewAcc()
    {
    	createNewAcc.click();
    }
}
