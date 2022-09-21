package qspider;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 
{
  public static void main(String[] args) 
{
  String key="webdriver.chrome.driver";
  String value="./software/chromedriver.exe";
  System.setProperty(key, value);
  ChromeDriver driver=new ChromeDriver();
 // driver.close();
  
}
}
