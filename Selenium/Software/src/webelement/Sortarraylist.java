package webelement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Sortarraylist {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		 WebDriver d=new FirefoxDriver();
		 d.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		 Thread.sleep(2000);
		 WebElement ele = d.findElement(By.id("month"));
		 Thread.sleep(2000);
		 Select s=new Select(ele);
		 Thread.sleep(2000);
		 List<WebElement> options = s.getOptions();
		 Thread.sleep(2000);
		 int count = options.size();
		 Thread.sleep(2000);
		 System.out.println(count);
		 //TreeSet tr = new TreeSet();
		 ArrayList<String> tr=new ArrayList<String>();
		 for( WebElement we:options)
		 {
			 String t = we.getText();
			 tr.add(t);
		 }
		// Collections.sort(tr); for Ascending order
		 Collections.sort(tr);
		 for( String ts:tr)
		 {
			 System.out.println(ts);
		 }

	}

}
