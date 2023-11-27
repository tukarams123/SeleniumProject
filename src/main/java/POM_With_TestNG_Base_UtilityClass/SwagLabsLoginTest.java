package POM_With_TestNG_Base_UtilityClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwagLabsLoginTest extends Base_Class {
	int a;
	SwagLabsHomePage home;
	SwagLabsLoginPage login;
	SwagLabsMenuPage menu;

	@BeforeClass
	public void openBrowser() throws InterruptedException, EncryptedDocumentException, IOException {
		initializeBrowser();

		login = new SwagLabsLoginPage(d);
		home = new SwagLabsHomePage(d);
		menu = new SwagLabsMenuPage(d);
		a = 20;

	}

	@BeforeMethod
	public void loginToApp() throws InterruptedException, EncryptedDocumentException, IOException {
		System.out.println(a);
		login.inpSwagLabsLoginPageUN(Utility_Class.getTestData(0, 0));
		Thread.sleep(1000);
		login.inpSwagLabsLoginPagePwd(Utility_Class.getTestData(0, 1));
		Thread.sleep(1000);
		login.clickSwagLabsLoginPageLoginBtn();
		Thread.sleep(3000);

	}

	@Test
	public void verifyTitle() throws EncryptedDocumentException, IOException {
		String actTitle = home.getSwagLabsHomePageTitle();
		String expTitle = Utility_Class.getTestData(0, 2);
		Assert.assertEquals(actTitle, expTitle, "Failed: Both results are different");
	}

	@AfterMethod
	public void logoutFromApp() throws InterruptedException, IOException {
		home.clickSwagLabsHomePageMenuBtn();
		Thread.sleep(2000);
		menu.clickSwagLabsMenuPageLogoutBtn();
		Thread.sleep(2000);
		Utility_Class.captureSS(d);
	}

	@AfterClass
	public void closeBrowser() {
		d.quit();
	}

}
