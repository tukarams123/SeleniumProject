package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetAllDataFromColumn {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream file = new FileInputStream("E:\\photos\\names.xlsx");
		Sheet sheet=WorkbookFactory.create(file).getSheet("Sheet1");
		int lastindex=sheet.getLastRowNum();
		
		
		for(int i=0;i<=lastindex;i++)
			
		{
			Cell cell=sheet.getRow(i).getCell(0);
			CellType type = cell.getCellType();

			if(type==CellType.STRING)
			{
				String stringValue=cell.getStringCellValue();
				System.out.println(stringValue);
			}
			else if(type==CellType.NUMERIC)
			{
				double numericValue = cell.getNumericCellValue();
				System.out.println(numericValue);
			}
			else if(type==CellType.BOOLEAN)
			{
				boolean booleanValue = cell.getBooleanCellValue();
			    System.out.println(booleanValue);
			}
			
		}

	}
}
