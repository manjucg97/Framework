package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Switchcontrol {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe")	;
		  WebDriver d=new ChromeDriver();
		  d.get("https://www.google.com/");
		  Thread.sleep(2000);
		  WebElement ele = d.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
		  Actions act=new Actions(d);
		  act.contextClick(ele).perform();
		  Robot r=new Robot();
		  r.keyPress(KeyEvent.VK_T);
		  r.keyRelease(KeyEvent.VK_T);
		  String pid = d.getWindowHandle();
		  Set<String> allwh = d.getWindowHandles();
		 allwh.remove(pid);
		 int count=allwh.size();
		 ArrayList<String> l=new ArrayList<String>(allwh);
		 l.add(pid);
		 for(String wh:l)
		 {
			 if(wh.equals(pid))
			 {
				 d.manage().window().maximize();
			 }
			 else{
		 d.switchTo().window(wh);
		 }
		 }
		d.manage().window().maximize();
		Thread.sleep(2000);
		 d.findElement(By.xpath("//a[.='తెలుగు']")).click();
		 d.findElement(By.xpath("//input[@title='సెర్చ్']")).sendKeys("manjunatha");
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 

		
	

	}

}
