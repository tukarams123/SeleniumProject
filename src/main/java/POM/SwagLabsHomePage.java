package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsHomePage {
	@FindBy(xpath = "//button[.='Open Menu']")
	private WebElement menu;
	WebDriver d;

	public SwagLabsHomePage(WebDriver d) {
		this.d = d; //Assign local driver information to global driver
		PageFactory.initElements(d, this);
	}

	public void verifySwagLabsHomePageTitle() {
		String actText = d.getTitle();
		String expText = "Swag Labs";
		if (actText.equals(expText)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		System.out.println(actText);
	}

	public void clickSwagLabsHomePageMenuBtn() {
		menu.click();
	}

}
