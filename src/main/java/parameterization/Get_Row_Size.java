package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Get_Row_Size {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("E:\\photos\\names.xlsx");
		int row_size=WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum()+1;
		System.out.println(row_size);

	}

}
 