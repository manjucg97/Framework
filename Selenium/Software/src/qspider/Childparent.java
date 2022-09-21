package qspider;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childparent {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe")	;
		  WebDriver d=new ChromeDriver();
		  d.get("https://skpatro.github.io/demo/links/");
		  Thread.sleep(2000);
		  d.findElement(By.name("NewWindow")).click();
		  Set<String> allwh = d.getWindowHandles();
		  int count = allwh.size();
		  for(String wh:allwh)
		  {
			  System.out.println(wh);
		
		  }
	

	}

}
