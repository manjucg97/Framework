package qspider;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;

public class Childbrowse {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe")	;
		  WebDriver d=new ChromeDriver();
		  d.get("https://skpatro.github.io/demo/links/");
		  Thread.sleep(2000);
		  String p_id = d.getWindowHandle();
		  System.out.println(p_id);
		  

	}

}
