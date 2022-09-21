package qspider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Shopping {

	public static void main(String[] args) throws InterruptedException
	{
     System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
     WebDriver d=new FirefoxDriver();
     d.get("http://demowebshop.tricentis.com/");
     d.findElement(By.xpath("(//a[contains(.,Books) and @href='/books'])[1]")).click();
     Thread.sleep(2000);
     d.findElement(By.xpath("(//input[@class='button-2 product-box-add-to-cart-button'])[1]")).click();
     Thread.sleep(2000);
     d.findElement(By.xpath("(//input[@class='button-2 product-box-add-to-cart-button'])[2]")).click();
     Thread.sleep(5000);
     d.findElement(By.xpath("//a[contains(.,Register) and @href='/register']/../following-sibling::li[2]/a[1]")).click();



     
     
     

	}

}
