package qspider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class insta
{
  public static void main(String[] args) 
{
  System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
  WebDriver d=new FirefoxDriver();
  d.get("https://www.instagram.com");
  d.findElement(By.cssSelector("input[name='username']")).sendKeys("cg_manju97");
  d.findElement(By.cssSelector("input[name='password']")).sendKeys("4gh16me405");
  d.findElement(By.cssSelector("button[type='submit']")).click();
}
}
