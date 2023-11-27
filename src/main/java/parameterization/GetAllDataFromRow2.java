package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetAllDataFromRow2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream file = new FileInputStream("E:\\photos\\names.xlsx");
		Row row=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0);
		int lastCellIndex=row.getLastCellNum()-1;
		
		for(int i=0;i<=lastCellIndex;i++)
		{
			String value=row.getCell(i).getStringCellValue();
			System.out.println(value);
		}
		

	}
}
