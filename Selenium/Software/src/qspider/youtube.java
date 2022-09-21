package qspider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class youtube {

	public static void main(String[] args) throws InterruptedException
{
  System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
  WebDriver d=new FirefoxDriver();
  d.get("https:/www.youtube.com");
  Thread.sleep(2000);
  d.findElement(By.cssSelector("input[id='search']")).sendKeys("kannada songs");
  Thread.sleep(2000);
  d.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
 Thread.sleep(2000);
  d.findElement(By.cssSelector("a[href='/watch?v=a_ZPclKGgZo']")).click();
  Thread.sleep(7000);
  d.findElement(By.cssSelector("button[class='ytp-ad-skip-button ytp-button']")).click();
}

}
