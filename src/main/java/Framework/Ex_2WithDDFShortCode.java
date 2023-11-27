package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_2WithDDFShortCode {

	public static void main(String[] args)
			throws EncryptedDocumentException, IOException, FileNotFoundException, InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://www.saucedemo.com/v1/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Thread.sleep(3000);
		FileInputStream file = new FileInputStream("‪C:\\app\\names.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");

		// fetch username from excel sheet
		// enter username
		d.findElement(By.id("user-name")).sendKeys(sh.getRow(0).getCell(0).getStringCellValue());

		// fetch password from excel sheet
		// enter password
		d.findElement(By.id("password")).sendKeys(sh.getRow(0).getCell(1).getStringCellValue());

		// click on Login button
		d.findElement(By.className("btn_action")).click();

		String actTitle = d.getTitle();

		// fetch expected title from excel sheet
		// and compare with the actual title
		if (actTitle.equals(sh.getRow(0).getCell(2).getStringCellValue())) {
			System.out.println("Test Case is pass");
		} else {
			System.out.println("Test Case is fail");

		}

	}

}
