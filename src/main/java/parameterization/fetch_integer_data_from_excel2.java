package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fetch_integer_data_from_excel2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException,FileNotFoundException {
		FileInputStream file=new FileInputStream("E:\\photos\\names.xlsx");
		Double d=WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(3).getNumericCellValue();
		System.out.println(d);
		



	}

}
