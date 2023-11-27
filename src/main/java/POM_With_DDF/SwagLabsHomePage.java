package POM_With_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsHomePage {
	@FindBy(xpath = "//button[.='Open Menu']")
	private WebElement menu;
	WebDriver d;

	public SwagLabsHomePage(WebDriver d) {
		this.d = d;
		PageFactory.initElements(d, this);
	}

	public void verifySwagLabsHomePageTitle(String expTitle) {
		String actTitle = d.getTitle();
		if (actTitle.equals(expTitle)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}

	public void clickSwagLabsHomePageMenuBtn() {
		menu.click();
	}

}
