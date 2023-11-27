package POM_With_TestNG_Base_UtilityClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Utility_Class {
	//@Author name:Somnath Shinde
	//This test method is use to get test data from excel sheet
	//need to pass 2 inputs: rowIndex,cellIndex

	public static String getTestData(int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("‪E:\\photos\\names.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		String value = sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return value;

	}
	
	//This test method is use to get screenshot of failed TC
	//need to pass webDriver object

	public static void captureSS(WebDriver d) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)d;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\admin\\eclipse-workspace\\SeleniumProject\\test-output\\FailedTestSS\\TestCaseID.jpg");
		Files.copy(src, dest);
	}

}
