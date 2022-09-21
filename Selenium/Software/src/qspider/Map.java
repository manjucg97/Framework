package qspider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.firefox.FirefoxDriver;

public class Map {

	public static void main(String[] args) throws InterruptedException 
	{
      System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
      WebDriver d=new FirefoxDriver();
      d.get("https://www.google.com/maps/");
      Thread.sleep(2000);
      d.findElement(By.xpath("//img[@src='//maps.gstatic.com/tactile/omnibox/directions-2x-20150909.png']")).click();
      Thread.sleep(2000);
     d.findElement(By.xpath("//input[@class='tactile-searchbox-input'and @aria-autocomplete='list' and @placeholder='Choose starting point, or click on the map...']")).sendKeys("bangalore");
      Thread.sleep(2000);
      d.findElement(By.xpath("//input[@class='tactile-searchbox-input' and @autocomplete='off' and @aria-autocomplete='list' and @placeholder='Choose destination, or click on the map...']")).sendKeys("mysore");
      Thread.sleep(2000);
   //.findElement(By.xpath("//button[@aria-label='Search']")).click();
      d.findElement(By.xpath("//img[@class='OzmNAc' and @aria-label='Driving']")).click();
		
	}

}
