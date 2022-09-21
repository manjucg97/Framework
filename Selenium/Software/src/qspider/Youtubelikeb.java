package qspider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Youtubelikeb {

	public static void main(String[] args) throws InterruptedException
	{
       System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
       WebDriver d=new FirefoxDriver();
       d.get("https://www.youtube.com");
       Thread.sleep(2000);
       d.findElement(By.xpath("//input[@id='search']")).sendKeys("super kannada movie");
       Thread.sleep(2000);
       d.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
       Thread.sleep(2000);
       d.findElement(By.xpath("//a[@id='video-title' and @href='/watch?v=-qZa241-CQs']")).click();
       Thread.sleep(5000);
       d.findElement(By.xpath("//div[text()='Skip Ads']")).click();
	}

}
