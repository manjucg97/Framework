package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nestested_frame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe")	;
		  WebDriver d=new ChromeDriver();
		  d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  d.get("https://demoqa.com/nestedframes");
		  d.switchTo().frame("frame1");
		  WebElement text1 = d.findElement(By.xpath("//body"));
		  System.out.println(text1.getText());
		  d.switchTo().frame(0);
		  WebElement text2 = d.findElement(By.xpath("//p"));
		  System.out.println(text2.getText());
		  d.switchTo().defaultContent();
		  d.close();
		  

	}

}
