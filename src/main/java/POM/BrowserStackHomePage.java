package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserStackHomePage {
	WebDriver d;
	@FindBy(xpath = "//h1")
	WebElement pageHeading;
	@FindBy(id = "signupModalProductButton")
	WebElement getStartedFree;

	public BrowserStackHomePage(WebDriver d) {
		this.d = d;
		PageFactory.initElements(d, this);
	}

	public void getBrowserStackHomePageHeading() {
		String getHeaderText = pageHeading.getText();
		System.out.println(getHeaderText);
	}
	
	public void verifyBrowserStackHomePageTitle()
	{
		String actTitle=d.getTitle();
		String expTitle=" ";
		if(actTitle.equals(expTitle))
		{
			System.out.println("Test Case Pass");
		}
		else
		{
			System.out.println("Test Case is fail");
		}
		System.out.println(actTitle);
	}

	public void clickBrowserStackHomePageGetStartedFree() {
//		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(d);
//		wait.withTimeout(Duration.ofSeconds(40));
//		wait.pollingEvery(Duration.ofSeconds(5));
//		wait.ignoring(TimeoutException.class);
//		wait.until(ExpectedConditions.visibilityOf(getStartedFree));
		WebDriverWait wait=new WebDriverWait(d, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(getStartedFree));
		getStartedFree.click();
	}

}
