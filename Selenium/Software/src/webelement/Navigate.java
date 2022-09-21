package webelement;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		  WebDriver d=new ChromeDriver();
		  d.navigate().to("https://www.google.com");
		  Thread.sleep(2000);
		  d.navigate().to("https://www.facebook.com");
		  d.manage().window().maximize();
		  Thread.sleep(2000);
		  d.navigate().back();
		  Thread.sleep(2000);
		  d.navigate().forward();
		  Thread.sleep(2000);
		  d.navigate().refresh();
		  Point p = new Point(200,300);
		  d.manage().window().setPosition(p);

	

	}

}
