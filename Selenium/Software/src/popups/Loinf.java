package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Loinf {

	public static void main(String[] args) throws InterruptedException 
	{
	 System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	 WebDriver d=new FirefoxDriver();
	 d.get("https://www.flipkart.com/");
	 Thread.sleep(2000);
	 d.findElement(By.xpath("//span[.='Enter Email/Mobile number']")).sendKeys("7760919868");
	 Thread.sleep(2000);
	 d.findElement(By.xpath("//span[.='Enter Password']")).sendKeys("4gh16me405");
	 Thread.sleep(2000);
	 d.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	}

}
