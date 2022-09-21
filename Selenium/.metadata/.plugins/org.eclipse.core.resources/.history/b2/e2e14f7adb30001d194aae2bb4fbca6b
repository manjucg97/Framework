package ng_prgms;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genric_script.Generic_script1;

public class Defends 
{
 @Test
 public void compose()
 {
	
	 Reporter.log("compose",true);
 }
 
 @Test(dependsOnMethods="compose")
 public void inbox()
 {
	 Reporter.log("inbox",true);
 }
 
 @Test(dependsOnMethods="inbox")
 public void delete()
 {
	 Reporter.log("delete",true);
	 Assert.fail();
 }
}
