package Disable_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clickon {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe")	;
		  WebDriver d=new ChromeDriver();
		  d.get("https://www.amazon.in");
		  Thread.sleep(2000);
		  JavascriptExecutor js=(JavascriptExecutor)d;
		  WebElement ele = d.findElement(By.xpath("//a[.='Facebook']"));
	       Point loc = ele.getLocation();
	       int x = loc.getX();
	       int y=loc.getY();
	       js.executeScript("window.scrollBy("+x+","+y+")");
	       ele.click();
	       

	}

}
