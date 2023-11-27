package POM_With_DDF_TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwagLabsLoginTest {
	int a;
	SwagLabsHomePage home;
	SwagLabsLoginPage login;
	SwagLabsMenuPage menu;
	WebDriver driver;
	Sheet sh;

	@BeforeClass
	public void openBrowser() throws InterruptedException, EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("‪E:\\photos\\names.xlsx");
		sh = WorkbookFactory.create(file).getSheet("Sheet2");
		WebDriver d = new ChromeDriver();
		d.get("https://www.saucedemo.com/v1/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		login = new SwagLabsLoginPage(d);
		home = new SwagLabsHomePage(d);
		menu = new SwagLabsMenuPage(d);
		a=20;

	}

	@BeforeMethod
	public void loginToApp() throws InterruptedException {
		System.out.println(a);
		login.inpSwagLabsLoginPageUN(sh.getRow(0).getCell(0).getStringCellValue());
		Thread.sleep(1000);
		login.inpSwagLabsLoginPagePwd(sh.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		login.clickSwagLabsLoginPageLoginBtn();
		Thread.sleep(3000);

	}
	
	@Test
	public void verifyTitle()
	{
		String actTitle=home.getSwagLabsHomePageTitle();
		String expTitle=sh.getRow(0).getCell(2).getStringCellValue();
		Assert.assertEquals(actTitle, expTitle,"Failed: Both results are different");
	}
	
	@AfterMethod
	public void logoutFromApp() throws InterruptedException
	{
		home.clickSwagLabsHomePageMenuBtn();
		Thread.sleep(2000);
		menu.clickSwagLabsMenuPageLogoutBtn();
		Thread.sleep(2000);
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}

}
