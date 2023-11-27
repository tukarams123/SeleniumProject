package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetDataByVerifyingTypeOfCell2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("E:\\photos\\names.xlsx");
		Cell cell=WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(3);
		CellType cellInfo = cell.getCellType();
		
		if(cellInfo==CellType.STRING)
		{
			String stringValue = cell.getStringCellValue();
			System.out.println(stringValue);
		}
		else if(cellInfo==CellType.NUMERIC)
		{
			double numericValue=cell.getNumericCellValue();
			System.out.println(numericValue);
		}
		else if(cellInfo==CellType.BOOLEAN)
		{
			boolean booleanValue = cell.getBooleanCellValue();
			System.out.println(booleanValue);
		}
		

	}

}
