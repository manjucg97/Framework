package webelement;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Arreylist {

	public static void main(String[] args) throws InterruptedException 
	{
	 System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	 WebDriver d= new FirefoxDriver();
	 d.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	 Thread.sleep(2000);
	 WebElement ele = d.findElement(By.id("month"));
	 Thread.sleep(2000);
     Select s=new Select(ele);
     List<WebElement> opt = s.getOptions();
     int count = opt.size();
     //ArrayList<String> a=new ArrayList<String>(t);
     TreeSet<String> t=new TreeSet<String>();
     ArrayList<String> a=new ArrayList<String>(t);
     for(WebElement we:opt)
     {
    	String t1 = we.getText();
    	t.add(t1);
     }
     for(String p:t)
     {
    	 System.out.println(p);
     }
	 

	}

}
