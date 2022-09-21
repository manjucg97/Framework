package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {

	public static void main(String[] args) throws InterruptedException 
	{
	  System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	  WebDriver d=new FirefoxDriver();
	  d.get("https://www.flipkart.com/");
	  Thread.sleep(2000);
	  d.findElement(By.xpath("//button[.='✕']")).click();
	  Thread.sleep(2000);
	  WebElement ele = d.findElement(By.xpath("(//div[.='Fashion'])[1]"));
	  Thread.sleep(2000);
	  Actions act=new Actions(d);
	  Thread.sleep(2000);
	  act.moveToElement(ele).perform();
	  Thread.sleep(5000);
	  WebElement elem = d.findElement(By.xpath("(//div[.='Electronics'])[1]"));
	  act.moveToElement(elem).perform();
	  

	}
	

}
