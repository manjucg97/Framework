package ng_prgms;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ngdemo1 
{
  @Test(priority=1)
  public void test1()
  {
	  Reporter.log("hi",true);
  }
  @Test
  public void test2()
  {
	  Reporter.log("hello",true);
  }
}
