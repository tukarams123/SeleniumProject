package POM_With_DDF_Short_Code;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabsLoginTest {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException,FileNotFoundException {
		FileInputStream file = new FileInputStream("‪C:\\app\\names.xlsx");
        Sheet sh=WorkbookFactory.create(file).getSheet("Sheet2");
		WebDriver d = new ChromeDriver();
		d.get("https://www.saucedemo.com/v1/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		SwagLabsLoginPage login = new SwagLabsLoginPage(d);
		login.inpSwagLabsLoginPageUN(sh.getRow(0).getCell(0).getStringCellValue());
		Thread.sleep(1000);
		login.inpSwagLabsLoginPagePwd(sh.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1000);
		login.clickSwagLabsLoginPageLoginBtn();
		Thread.sleep(1000);
		
		SwagLabsHomePage home=new SwagLabsHomePage(d);
		home.verifySwagLabsHomePageTitle(sh.getRow(0).getCell(2).getStringCellValue());
		Thread.sleep(1000);
		home.clickSwagLabsHomePageMenuBtn();
				

		SwagLabsMenuPage menu = new SwagLabsMenuPage(d);
		Thread.sleep(1000);
		menu.clickSwagLabsMenuPageLogoutBtn();

	}

}
