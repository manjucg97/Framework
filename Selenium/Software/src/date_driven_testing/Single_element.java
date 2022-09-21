package date_driven_testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Single_element {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//Specify the path
      FileInputStream fis=new FileInputStream("./excel/testdata.xlsx");
      //open the excel
      Workbook book = WorkbookFactory.create(fis);
      //specify the she
      Sheet sh = book.getSheet("Sheet1");
      //specify the row
      Row rw = sh.getRow(0);
      // Specify the cell
      Cell cl = rw.getCell(0);
      //fetch the date
      String value = cl.getStringCellValue();
      System.out.println(value);
      
      
	}

}
