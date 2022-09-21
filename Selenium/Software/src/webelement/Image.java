package webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Image {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		 WebDriver d=new FirefoxDriver();
		 d.get("https://www.amazon.com/");
		 List<WebElement> image= d.findElements(By.xpath("//img"));
		 int count = image.size();
		 for(WebElement we:image)
		 {
			  String im = we.getAttribute("src");
			  System.out.println(im);
		 }

	}

}
