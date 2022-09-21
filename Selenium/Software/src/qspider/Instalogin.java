package qspider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instalogin {

	public static void main(String[] args)
	{
      System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
      WebDriver d1=new ChromeDriver();
      d1.get("https://www.instagram.com/accounts/login/");
      d1.findElement(By.name("username")).sendKeys("7760919868");
      d1.findElement(By.name("password")).sendKeys("7760919868");
      //d1.findElement(by)

	}

}
