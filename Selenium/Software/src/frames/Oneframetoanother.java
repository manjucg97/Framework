package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oneframetoanother 
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe")	;
	  WebDriver d=new ChromeDriver();
	  d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  d.get("https://demoqa.com/frames");
	  d.switchTo().frame("frame1");
	  WebElement texr1 = d.findElement(By.id("sampleHeading"));
	  System.out.println("frame1 : "+texr1.getText());
	  d.switchTo().defaultContent();
	  d.switchTo().frame("frame2");
	  WebElement text2 = d.findElement(By.id("sampleHeading"));
	  System.out.println("frame 2: "+text2.getText());
	  d.switchTo().defaultContent();
	  d.close();
}
}
