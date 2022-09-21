package frames;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Genericode 
{
	public static void getPhoto(WebDriver driver) throws IOException
	{
		String photo="";
		Date T=new Date();
	     System.out.println(T);
	     String d1 = T.toString();
	     String d2 = d1.replaceAll(":","-");
	     TakesScreenshot ts=(TakesScreenshot)driver;
	     File src = ts.getScreenshotAs(OutputType.FILE);
	     //String M = T.+"-"+T.getHours()+"-"+T.getMinutes()+"-"+T.getSeconds();
	    
	    // File dst = new File("C:\\Users\\Manjunatha C G\\Desktop\\New folder\\"+M+".jpeg");
	    // FileUtils.copyFile(src, dst);
	     
		
	}
	

}
