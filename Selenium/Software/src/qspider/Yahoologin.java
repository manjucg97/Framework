package qspider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Yahoologin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		  WebDriver d=new FirefoxDriver();
		  d.get("https://login.yahoo.com/?.intl=in");
		  d.findElement(By.xpath("//input[@type='text']")).sendKeys("manjunathacg");
		  d.findElement(By.xpath("//input[@type='submit']")).click();
		  Thread.sleep(5000);
		  d.findElement(By.xpath("//input[@type='password']")).sendKeys("7760919868");
		  Thread.sleep(3000);
		  d.findElement(By.xpath("//button[@id='login-signin']")).click();
		  Thread.sleep(3000);
		  d.findElement(By.xpath("//a[@id='ymail']")).click();
		  Thread.sleep(3000);
		  d.findElement(By.xpath("//a[@href='/d/compose/']")).click();
		  Thread.sleep(3000);
		  d.findElement(By.xpath("//input[@id='message-to-field' and @type='text']")).sendKeys("manjunathcg405@gmail.com");
		  Thread.sleep(3000);
		  d.findElement(By.xpath("//input[@class='q_T y_Z2hYGcu je_0 jb_0 X_0 N_fq7 G_e A_6EqO C_Z281SGl ir_0 P_0 bj3_Z281SGl b_0 j_n d_72FG em_N']")).sendKeys("hi");
		  Thread.sleep(3000);
		  d.findElement(By.xpath("//button[@type='button' and @title='Send this email']")).click();



	}

}
