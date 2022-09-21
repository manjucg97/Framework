package qspider;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
	  System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe")	;
	  WebDriver d=new ChromeDriver();
	  d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  d.get("https://www.facebook.com/login/");
	  
	  d.findElement(By.id("email")).sendKeys("7760919868");
	 
	  d.findElement(By.id("pass")).sendKeys("4gh16me405@");
	 
	  d.findElement(By.name("login")).click(); 

	  d.findElement(By.xpath("(//input[@placeholder='Search Facebook'])[1]")).sendKeys("punith rajkumar");
	 
	  // d.findElement(By.xpath("(//span[@class='ijkhr0an pvl4gcvk sgqwj88q bp9cbjyn j83agx80 g0qnabr5 hzruof5a tw6a2znq'])[1]")).click();
	   
	}

}
