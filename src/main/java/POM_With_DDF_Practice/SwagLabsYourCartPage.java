package POM_With_DDF_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsYourCartPage {
	@FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
	private WebElement productName;
	
	public SwagLabsYourCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifySwagLabsYourCartPageProductName(String expProductName)
	{
		String actProductName=productName.getText();
		System.out.println("Actual product name: "+actProductName);
		System.out.println("Expected product name: "+expProductName);
		if(actProductName.equals(expProductName))
		{
			System.out.println("TC Pass");
		}
		else {
			System.out.println("TC Fail");
		}
	}

}
