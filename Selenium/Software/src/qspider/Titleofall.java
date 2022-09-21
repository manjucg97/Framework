package qspider;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Titleofall {

	public static void main(String[] args) throws InterruptedException
	{
      System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
      WebDriver d=new FirefoxDriver();
      d.get("https://skpatro.github.io/demo/links/");
      d.findElement(By.name("NewWindow")).click();
      Thread.sleep(2000);
      Set<String> allwh = d.getWindowHandles();
      int count = allwh.size();
      System.out.println(count);
      for(String wh:allwh)
      {
    	 d.switchTo().window(wh);
    	 Thread.sleep(2000);
    	 String title = d.getTitle();
    	 Thread.sleep(2000);
    	 System.out.println(title);
    	 Thread.sleep(2000);
    	 d.close();
 
      }
	}

}
