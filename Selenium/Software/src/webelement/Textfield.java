package webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Textfield {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		 WebDriver d=new FirefoxDriver();
		 d.get("file:///C:/Users/Manjunatha%20C%20G/Desktop/text.html");
		 List<WebElement> ch = d.findElements(By.xpath("//input"));
		 int count = ch.size();
		 for(WebElement we:ch)
		 {
			 we.sendKeys("manju");
			 Thread.sleep(2000);
		 }
		 Thread.sleep(2000);
		 for(int i=count-1;i>=0;i--)
		 {
			 WebElement we = ch.get(i);
			 we.clear();
			 Thread.sleep(2000);
		 }
		 
	}

}
