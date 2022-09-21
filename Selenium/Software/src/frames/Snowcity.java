package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snowcity {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe")	;
		  WebDriver d=new ChromeDriver();
		  d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  d.get("https://snowcityblr.com/");
		  d.findElement(By.xpath("//a[.='Contact Us']")).click();
		  d.switchTo().frame("//iframe");
		 // d.switchTo().frame("")
		 

 

	}

}
