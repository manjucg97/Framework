package date_driven_testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multi_write2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
      FileInputStream fis=new FileInputStream("./excel/testdata.xlsx");
      Workbook book = WorkbookFactory.create(fis);
      Sheet sh = book.getSheet("Sheet1");
      System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
      WebDriver d=new FirefoxDriver();
      d.get("https://www.amazon.in");
      d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      List<WebElement> image = d.findElements(By.xpath("//img"));
      for(int i=0;i<image.size();i++)
      {
    	  Row ro = sh.createRow(i);

    	  Cell cel = ro.createCell(0);
    	  cel.setCellValue(image.get(i).getAttribute(""));
    	
      }
      FileOutputStream fos=new FileOutputStream("./excel/testdata.xlsx");
      book.write(fos);
	}

}
