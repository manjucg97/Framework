package qspider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getpagesrc {
	public static void main(String[] args) 
	{
	  System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	  WebDriver d3=new ChromeDriver();
	  d3.get("https://www.facebook.com");
	  String scr = d3.getPageSource();
	  System.out.println(scr);
	}

}
