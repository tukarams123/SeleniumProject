package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fetch_boolean_data_from_excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException,FileNotFoundException {
		FileInputStream gf = new FileInputStream("‪E:\\photos\\names.xlsx");
		boolean b=WorkbookFactory.create(gf).getSheet("Sheet1").getRow(0).getCell(2).getBooleanCellValue();
		System.out.println(b);
		
//		Workbook wb=WorkbookFactory.create(gf);
//		Sheet sheet=wb.getSheet("Sheet1");
//		Row row=sheet.getRow(0);
//		Cell cell=row.getCell(2);
//		boolean value=cell.getBooleanCellValue();
//		System.out.println(value);


	}

}
