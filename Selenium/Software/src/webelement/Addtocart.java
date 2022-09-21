package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Addtocart {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		 WebDriver d=new FirefoxDriver();
		 d.get("https:/www.amazon.in");
		 Thread.sleep(2000);
		 d.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("vivo mobiles");
		 Thread.sleep(5000);
		 d.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		 Thread.sleep(5000);
	}

}
