package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Get_Type_of_Data_of_Cell2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("E:\\photos\\names.xlsx");
		CellType type = WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(3).getCellType();
		System.out.println(type);

	}

}
