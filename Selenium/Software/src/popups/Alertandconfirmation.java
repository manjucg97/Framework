package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alertandconfirmation {

	public static void main(String[] args) throws InterruptedException 
	{
	  System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	  WebDriver d=new FirefoxDriver();
	  d.navigate().to("http://demo.guru99.com/test/delete_customer.php");
	  Thread.sleep(2000);
	  d.findElement(By.name("cusid")).sendKeys("selenium");
	  Thread.sleep(2000);
	  d.findElement(By.name("submit")).click();
	  Thread.sleep(2000);
	  Alert a = d.switchTo().alert();
	  String t = a.getText();
	  System.out.println(t);
	  a.accept();
	  //a.dismiss();
	  
	

	}

}
