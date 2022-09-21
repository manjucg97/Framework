package qspider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) //throws InterruptedException
	{
		String key="webdriver.chrome.driver";
		  String value="./software/chromedriver.exe";
		  System.setProperty(key, value);
		  WebDriver driver=new ChromeDriver();
		  driver.get("http://www.youtube.com");
		  driver.manage().window().maximize();
		 // Thread.sleep(10000);
		  //driver.close();
		 
	}

}
