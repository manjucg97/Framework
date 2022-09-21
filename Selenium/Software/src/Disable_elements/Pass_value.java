package Disable_elements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Pass_value {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe")	;
		  WebDriver d=new ChromeDriver();
		  d.get("file:///C:/Users/Manjunatha%20C%20G/Desktop/java/assignment2/Disabled.html");
		  Thread.sleep(2000);
		  JavascriptExecutor js=(JavascriptExecutor)d;
		  js.executeScript("document.getElementById('t1').value='selenium'");
		  

	}

}
