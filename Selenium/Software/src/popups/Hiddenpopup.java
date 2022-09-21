package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hiddenpopup {

	public static void main(String[] args) throws InterruptedException 
	{
	 System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	 WebDriver d=new FirefoxDriver();
	 d.get("https://www.makemytrip.com/");
	 Thread.sleep(2000);
	 d.findElement(By.xpath("//p[.='Thursday']")).click();
	 Thread.sleep(2000);
	d.findElement(By.xpath("//div[.='18']")).click();

	}

}
