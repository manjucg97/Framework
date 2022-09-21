package webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		 WebDriver d=new FirefoxDriver();
		 d.get("file:///C:/Users/Manjunatha%20C%20G/Desktop/check.html");
		 List<WebElement> ch = d.findElements(By.xpath("//input"));
		 int count = ch.size();
		 for(int i=0;i<count;i++)
		 {
			 WebElement we = ch.get(i);
			 we.click();
		 }
		 Thread.sleep(2000);
		 for(int i=count-1;i>=0;i--)
		 {
			 WebElement we = ch.get(i);
			 we.click();
		 }
		 

	}

}
