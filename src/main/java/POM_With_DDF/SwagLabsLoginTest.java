package POM_With_DDF;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabsLoginTest {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("‪E:\\photos\\names.xlsx");
        Sheet sh=WorkbookFactory.create(file).getSheet("Sheet2");
		WebDriver d = new ChromeDriver();
		d.get("https://www.saucedemo.com/v1/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		SwagLabsLoginPage login = new SwagLabsLoginPage(d);
		String unValue=sh.getRow(0).getCell(0).getStringCellValue();
		login.inpSwagLabsLoginPageUN(unValue);
		Thread.sleep(1000);
		String pwdValue=sh.getRow(0).getCell(1).getStringCellValue();
		login.inpSwagLabsLoginPagePwd(pwdValue);
		Thread.sleep(1000);
		login.clickSwagLabsLoginPageLoginBtn();
		Thread.sleep(1000);
		
		SwagLabsHomePage home=new SwagLabsHomePage(d);
		String expTitle=sh.getRow(0).getCell(2).getStringCellValue();
		home.verifySwagLabsHomePageTitle(expTitle);
		Thread.sleep(1000);
		home.clickSwagLabsHomePageMenuBtn();
				

		SwagLabsMenuPage menu = new SwagLabsMenuPage(d);
		Thread.sleep(1000);
		menu.clickSwagLabsMenuPageLogoutBtn();

	}

}
