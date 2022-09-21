package qspider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Geturl {

	public static void main(String[] args)
	{
      System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
      WebDriver d2=new ChromeDriver();
      d2.get("https://www.facebook.com");
      String url= d2.getCurrentUrl();
      System.out.println(url);

	}

}
