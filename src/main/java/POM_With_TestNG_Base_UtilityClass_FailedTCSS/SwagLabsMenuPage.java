package POM_With_TestNG_Base_UtilityClass_FailedTCSS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsMenuPage {

	@FindBy(linkText = "Logout")
	WebElement logOut;

	public SwagLabsMenuPage(WebDriver d) {
		PageFactory.initElements(d, this);
	}

	public void clickSwagLabsMenuPageLogoutBtn() {
		logOut.click();
	}

}
