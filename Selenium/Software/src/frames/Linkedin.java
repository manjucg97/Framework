package frames;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import frames.Genericode;

public class Linkedin {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
	 System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	 WebDriver d=new FirefoxDriver();
	 d.get("https://in.linkedin.com/");
	 Thread.sleep(2000);
	 Genericode.getPhoto(d);
	 /*TakesScreenshot ts=(TakesScreenshot)d;
	 File scr = ts.getScreenshotAs(OutputType.FILE);
	File dsn = new File("C:\\Users\\Manjunatha C G\\Desktop\\New folder\\001.jpeg");
	FileUtils.copyFile(scr, dsn);*/
	 d.findElement(By.xpath("//a[@href='https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin']")).click();
	 Thread.sleep(2000);
     d.findElement(By.xpath("//input[@id='username']")).sendKeys("manjucg555@gmail.com");
     Thread.sleep(2000);
     d.findElement(By.xpath("//input[@id='password']")).sendKeys("4gh16me405");
     Thread.sleep(2000);
     //d.findElement(By.xpath("//button[.='Sign in']")).click();
     Genericode.getPhoto(d);
	}

}
