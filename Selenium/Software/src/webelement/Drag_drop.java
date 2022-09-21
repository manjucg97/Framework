package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver; 
import org.openqa.selenium.interactions.Actions;


public class Drag_drop {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		 WebDriver d= new FirefoxDriver();
		 d.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		 Thread.sleep(2000);
		 WebElement scr = d.findElement(By.xpath("//div[.='Washington']"));
		 WebElement trg = d.findElement(By.xpath("//div[.='United States']"));
		 Actions act=new Actions(d);
		 act.dragAndDrop(scr, trg).perform();
		

	}

}
