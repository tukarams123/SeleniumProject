package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Get_All_Data_From_Sheet {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream file = new FileInputStream("E:\\photos\\names.xlsx");
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
		int lastrowindex = sheet.getLastRowNum();

		for (int i = 0; i <= lastrowindex; i++)

		{
			int lastcellindex = sheet.getRow(i).getLastCellNum() - 1;
			for (int j = 0; j <= lastcellindex; j++) {

				Cell cell = sheet.getRow(i).getCell(j);
				CellType type = cell.getCellType();

				if (type == CellType.STRING) {
					String stringValue = cell.getStringCellValue();
					System.out.print(stringValue + " ");
				} else if (type == CellType.NUMERIC) {
					double numericValue = cell.getNumericCellValue();
					System.out.print(numericValue + " ");
				} else if (type == CellType.BOOLEAN) {
					boolean booleanValue = cell.getBooleanCellValue();
					System.out.print(booleanValue + " ");
				}
			}
			System.out.println();

		}
	}
}
