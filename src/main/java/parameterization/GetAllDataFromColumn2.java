package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetAllDataFromColumn2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream file = new FileInputStream("E:\\photos\\names.xlsx");
		Sheet sheet=WorkbookFactory.create(file).getSheet("Sheet1");
		int lastRowIndex=sheet.getLastRowNum();
		
		for(int i=0;i<=lastRowIndex;i++)
		{
			String value=sheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(value);
		}
		

	}
}
