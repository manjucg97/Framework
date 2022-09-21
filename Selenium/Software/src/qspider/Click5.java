package qspider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click5 
{
  public static void main(String[] args) 
 {
   System.setProperty("webdriver.chrome.driver", "./software/chromeDriver.exe");
   WebDriver d=new ChromeDriver();
   d.get("https://www.youtube.com/watch?v=5Ysdx07VpDk");
   d.findElements(By.id("watch7-content"));
   
}
}
