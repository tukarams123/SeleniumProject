package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fetch_integer_data_from_excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException,FileNotFoundException {
		FileInputStream file = new FileInputStream("‪E:\\photos\\names.xlsx");
		
//		Workbook book = WorkbookFactory.create(file);
//		Sheet sheet=book.getSheet("Sheet1");
//		Row row=sheet.getRow(2);
//		Cell cell=row.getCell(1);
//		Double d=cell.getNumericCellValue();
//		System.out.println(d);
		
		Double d=WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(1).getNumericCellValue();
		System.out.println(d);


	}

}
