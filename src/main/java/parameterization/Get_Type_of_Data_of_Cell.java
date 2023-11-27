package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Get_Type_of_Data_of_Cell {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("E:\\photos\\names.xlsx");
		CellType type = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getCellType();
		System.out.println(type);

	}

}
