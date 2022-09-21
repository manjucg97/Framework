package webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alllinks {

	public static void main(String[] args) 
	{
	 System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	 WebDriver d=new FirefoxDriver();
	 d.get("https:/www.amazon.com");
	 List<WebElement> ele = d.findElements(By.xpath("//a"));
	 int count = ele.size();
	 for(int i=0; i<count;i++)
	 {
		WebElement we = ele.get(i);
		String text = we.getText();
		System.out.println(text);
	 }

	}

}
