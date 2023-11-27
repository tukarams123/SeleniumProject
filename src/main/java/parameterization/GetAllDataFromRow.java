package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetAllDataFromRow {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("E:\\photos\\names.xlsx");
		Sheet sheet=WorkbookFactory.create(file).getSheet("Sheet1");
		int lastcellindex=sheet.getRow(0).getLastCellNum()-1;
		
		for(int i=0;i<=lastcellindex;i++)
		{
			Cell cell=sheet.getRow(0).getCell(i);
			CellType type = cell.getCellType();
			
			if(type==CellType.STRING)
			{
			String stringValue=cell.getStringCellValue();
			System.out.print(stringValue+" ");
			}
			else if(type==CellType.NUMERIC)
			{
				double numericValue = cell.getNumericCellValue();
				System.out.print(numericValue+" ");
			}
			else if(type==CellType.BOOLEAN)
			{
				boolean booleanValue = cell.getBooleanCellValue();
				System.out.print(booleanValue+" ");
			}
		}

	}

}
