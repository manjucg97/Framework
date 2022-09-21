package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Size {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		  WebDriver d=new ChromeDriver();
		  d.get("https://www.facebook.com");
		  Thread.sleep(2000);
		 WebElement ele = d.findElement(By.id("pass"));
		int height = ele.getSize().getHeight();
		System.out.println(height);
		int width = ele.getSize().getWidth();
		System.out.println(width);
		 

	}

}
