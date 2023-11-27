package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Get_All_Data_From_Sheet2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream file = new FileInputStream("E:\\photos\\names.xlsx");
		Sheet sheet=WorkbookFactory.create(file).getSheet("Sheet1");
		int lastRowIndex=sheet.getLastRowNum();
		
		for(int i=0;i<=lastRowIndex;i++)
		{
			int lastCellIndex=sheet.getRow(i).getLastCellNum()-1;
			for(int j=0;j<=lastCellIndex;j++)
			{
				String values=sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(values+" ");
			}
			System.out.println();
		}

	}
	}
