package qspider;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sele {

	public static void main(String[] args) throws InterruptedException
	{
	   System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
       WebDriver d=new FirefoxDriver();
       WebDriver d1=new FirefoxDriver();
       d.get("file:///C:/Users/Manjunatha%20C%20G/Desktop/Sele.html");
       Thread.sleep(2000);
       d.findElement(By.xpath("//input[@id='a1']")).sendKeys(Keys.CONTROL+"ac");  
       Thread.sleep(2000);
       d1.findElement(By.xpath("//input[@id='a2']")).sendKeys(Keys.CONTROL+"av");  
       Thread.sleep(2000);
	}

}
