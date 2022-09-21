package genric_script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_script1 
{
public WebDriver driver;
 @BeforeMethod
 public void open()
	 {
	 System.setProperty("webdriver.gecko.driver","./soft/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
 
 @AfterMethod
 public void close() throws InterruptedException
 {
	 Thread.sleep(2000);
	driver.close(); 
 }
 
 }

