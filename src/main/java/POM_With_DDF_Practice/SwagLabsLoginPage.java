package POM_With_DDF_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsLoginPage {

	// Step 1:Declaration of variables globally with access level "private"

	@FindBy(id = "user-name") // private WebElement UN=d.findElement(By.id(""));
	private WebElement UN;
	@FindBy(id = "password") // private WebElement PW=d.findElement(By.id(""));
	private WebElement PW;
	@FindBy(className = "btn_action") // private WebElement logInBtn=d.findElement(By.className(""));
	private WebElement logInBtn;
	@FindBy(xpath = "//h3[text()='Password is required']")
	private WebElement errorMsg;

	// Initialize data memebers within a constructor with access level "public"

	public SwagLabsLoginPage(WebDriver d) {
		// PageFactory class to initialize WebElements defined in POM class
		PageFactory.initElements(d, this);
		// className.methodName(Webdriver object,this keyword)
	}

	// Utilize data members in a method with access level "public"
	public void inpSwagLabsLoginPageUN(String username) {
		UN.sendKeys(username);
	}

	public void inpSwagLabsLoginPagePwd(String pswd) {
		PW.sendKeys(pswd);
	}

	public void clickSwagLabsLoginPageLoginBtn() {
		logInBtn.click();
	}
	
	public void verifySwagLabsLoginPageErrorMsg(String expErrorMsg)
	{
		String actErrorMsg=errorMsg.getText();
		System.out.println("Actual error message: "+actErrorMsg);
		System.out.println("Expected error message: "+expErrorMsg);
		if(actErrorMsg.equals(expErrorMsg))
		{
			System.out.println("TC Pass");
		}
		else
		{
			System.out.println("TC Fail");
		}
	}
}
