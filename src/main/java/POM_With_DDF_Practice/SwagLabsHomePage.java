package POM_With_DDF_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsHomePage {
	@FindBy(xpath = "//button[.='Open Menu']")
	private WebElement menu;
	@FindBy(xpath = "(//button[text()='ADD TO CART'])[1]")
	private WebElement addToCart;
	@FindBy(xpath  = "//div[@id='shopping_cart_container']")
	private WebElement yourCart;
	WebDriver d;

	public SwagLabsHomePage(WebDriver d) {
		this.d = d;
		PageFactory.initElements(d, this);
	}

	public void verifySwagLabsHomePageTitle(String expTitle) {
		String actTitle = d.getTitle();
		System.out.println("Actual title: "+actTitle);
		System.out.println("Expected title: "+expTitle);
		if (actTitle.equals(expTitle)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}

	public void clickSwagLabsHomePageMenuBtn() {
		menu.click();
	}
	
	public void clickSwagLabsHomePageAddToCart()
	{
		addToCart.click();
	}
	
	public void clickSwagLabsHomePageYourCart()
	{
		yourCart.click();
	}

}
