package qspider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Youtubelike {
	public static void main(String[] args) throws InterruptedException
{
  System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
  WebDriver d=new FirefoxDriver();
  d.get("https:/www.youtube.com");
  Thread.sleep(3000);
  d.findElement(By.xpath("//input[@id='search']")).sendKeys("upendra songs");
  Thread.sleep(3000);
  d.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
 Thread.sleep(3000);
  d.findElement(By.xpath("//a[@id='video-title' and @class='yt-simple-endpoint style-scope ytd-video-renderer' and @href='/watch?v=fozzwQ_ZS3U']")).click();
  Thread.sleep(7000);
  d.findElement(By.xpath("//button[@class='ytp-ad-skip-button ytp-button']")).click();
  Thread.sleep(3000);
  d.findElement(By.xpath("//yt-formatted-string[@id='text' and text()='39K']")).click();
  
}

}
