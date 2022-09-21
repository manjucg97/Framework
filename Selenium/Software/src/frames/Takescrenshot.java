package frames;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class Takescrenshot {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("https://www.google.com");
		Thread.sleep(2000);
		d.findElement(By.xpath("a[.='ಕನ್ನಡ']")).click();
		Thread.sleep(2000);
		File src = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		File desc = new File("C:\\Users\\Manjunatha C G\\Desktop\\New folder\\02.png");
		//Files.copy(src,desc);
		FileUtils.copyFile(src, desc);
	}

}
