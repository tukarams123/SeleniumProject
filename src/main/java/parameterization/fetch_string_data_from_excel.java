package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fetch_string_data_from_excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException,FileNotFoundException {
		FileInputStream gf = new FileInputStream("‪E:\\photos\\name.xlsx");
//		Workbook wb = WorkbookFactory.create(file);
//		Sheet sheet = wb.getSheet("Sheet1");
//		Row row = sheet.getRow(0);
//		Cell cell = row.getCell(0);
//		String value=cell.getStringCellValue();
//		System.out.println(value);
		
		String value=WorkbookFactory.create(gf).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(value);

	}

}
