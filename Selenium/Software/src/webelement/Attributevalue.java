package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attributevalue {

	public static void main(String[] args) throws InterruptedException
	{
	  System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	  WebDriver d=new ChromeDriver();
	  d.get("https://www.facebook.com");
	  Thread.sleep(2000);
	  WebElement ele = d.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
	 // String attribute = ele.getAttribute("href");
     // System.out.println(attribute);
	  String text = ele.getText();
	  System.out.println(text);
	  Point loc = ele.getLocation();
	  System.out.println(loc);
	  int x=loc.getX();
	  System.out.println(x);
	   int y=loc.getY();
	   System.out.println(y);
	  String f = ele.getCssValue("font-size");
	  System.out.println(f);
	}

}
