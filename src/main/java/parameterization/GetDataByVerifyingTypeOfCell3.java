package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetDataByVerifyingTypeOfCell3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("E:\\photos\\names.xlsx");
		Cell cell = WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(3);
		CellType type = cell.getCellType();

		if (type == CellType.STRING) {
			String stringValue = cell.getStringCellValue();
			System.out.println(stringValue);
		} else if (type == CellType.NUMERIC) {
			double numericValue = cell.getNumericCellValue();
			System.out.println(numericValue);
		} else if (type == CellType.BOOLEAN) {
			boolean booleanValue = cell.getBooleanCellValue();
			System.out.println(booleanValue);
		}

	}

}
