package popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childclose {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe")	;
		  WebDriver d=new ChromeDriver();
		  d.get("https://skpatro.github.io/demo/links/");
		  Thread.sleep(2000);
		  d.findElement(By.name("NewWindow")).click();
		  String p_id = d.getWindowHandle();
		  Set<String> allwh = d.getWindowHandles();
		  int count = allwh.size();
		  System.out.println(count);
		  allwh.remove(p_id);
		  int count1 = allwh.size();
		  System.out.println(count1);
		  for(String wh:allwh)
		  {
			 d.switchTo().window(wh);
			 String t = d.getTitle();
			 System.out.println(t);
			 d.close();
		
		  }
		

	}

}
