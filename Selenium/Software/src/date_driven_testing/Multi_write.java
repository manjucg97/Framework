package date_driven_testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multi_write {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		FileInputStream fis=new FileInputStream("./excel/testdata.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet2");
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe")	;
		  WebDriver d=new ChromeDriver();
		  d.get("https://www.amazon.in/");
		  Thread.sleep(2000);
		  List<WebElement> links = d.findElements(By.xpath("//a"));
		  
		  for(int i=0;i<links.size();i++)
		  {
			  Row ro = sh.createRow(i);
			  Cell cel = ro.createCell(0);
			  cel.setCellValue(links.get(i).getAttribute("href"));
		  }
		  FileOutputStream fos=new FileOutputStream("./excel/testdata.xlsx");
		  book.write(fos);
		

	}

}
