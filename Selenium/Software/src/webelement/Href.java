package webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Href {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		 WebDriver d=new FirefoxDriver();
		 d.get("https://www.amazon.com/");
		 List<WebElement> links= d.findElements(By.xpath("//a"));
		 int count = links.size();
		 for(WebElement we:links)
		 {
			  String l = we.getAttribute("href");
			  System.out.println(l);
		 }

	}

}
