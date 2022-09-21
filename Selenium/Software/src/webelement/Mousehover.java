package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		 WebDriver d= new FirefoxDriver();
		 d.get("https://www.flipkart.com/");
		 Thread.sleep(2000);
		 d.findElement(By.xpath("//button[.='✕']")).click();
		 Thread.sleep(2000);
		 WebElement ele = d.findElement(By.xpath("//div[.='Fashion' and @class='xtXmba']"));
		 Actions act=new Actions(d);
		 act.moveToElement(ele).perform();
		 

		 
		 
	

	}

}
