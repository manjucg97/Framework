package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		 WebDriver d= new FirefoxDriver();
		 d.get("http://demo.guru99.com/test/simple_context_menu.html");
		 Thread.sleep(2000);
		 WebElement ele = d.findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
		 Thread.sleep(2000);
		 Actions act=new Actions(d);
		 act.doubleClick(ele).perform();


	}

}
