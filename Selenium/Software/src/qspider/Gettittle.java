package qspider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettittle {

	public static void main(String[] args) 
	{
      System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
      WebDriver d1=new ChromeDriver();
      d1.get("https://www.facebook.com");
      String title = d1.getTitle();
      System.out.println(title);

	}

}
