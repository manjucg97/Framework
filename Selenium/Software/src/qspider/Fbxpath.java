package qspider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fbxpath {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		  WebDriver d=new FirefoxDriver();
		  d.get("https://www.facebook.com/login/");
		  d.findElement(By.xpath("//input[@id='email']")).sendKeys("manjunathacg405");
		  d.findElement(By.xpath("//input[@id='pass']")).sendKeys("manjunathacg405");
		  d.findElement(By.xpath("//button [@id='loginbutton']")).click();
	

	}

}
