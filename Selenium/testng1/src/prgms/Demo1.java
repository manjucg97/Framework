package prgms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1
{
 
	@Test
	public void test1()
	{
		System.setProperty("webdriver.gecko.driver", "./soft/geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("https://www.facebook.com");
		Reporter.log("hi",true);
	}
	
	 /*
		@Test
		public void test2()
		{
			Reporter.log("hi111",true);
		}


		 
		@Test
		public void test5()
		{
			Reporter.log("hi222",true);
		}
		*/

}