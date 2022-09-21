package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException 
	{
	  System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	  WebDriver d=new FirefoxDriver();
	  d.get("https://www.globalsqa.com/demo-site/frames-and-windows/");
	  Thread.sleep(2000);
	  d.findElement(By.xpath("//li[.='iFrame']")).click();
	  Thread.sleep(2000);
      WebElement ele = d.findElement(By.xpath("//iframe[@id='aswift_1']"));
      Thread.sleep(5000);
      d.switchTo().frame(ele);
      Thread.sleep(5000);
      d.findElement(By.id("s")).sendKeys("sele");
		  	

	}

}
