package tests;

import java.time.Duration;

import org.testng.annotations.Test;

import base.Baseclass;
import pages.Productselectionpage;
import pages.Suptailsloginpage;


public class Productselectiontest extends Baseclass{
	
	@Test
	public void test() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
	
	Productselectionpage obj=new Productselectionpage(driver);
	Thread.sleep(6000);
	
	Suptailsloginpage ob=new Suptailsloginpage(driver);

	ob.login();
	Thread.sleep(9000);
	ob.setvalues("Arya5","Jos","aryacd@gmail.com", "aryacd123");
	Thread.sleep(16000);
	ob.signin();
	Thread.sleep(8000);
	obj. mousehover();
	obj.clickproduct();
	Thread.sleep(19000);
	
	}
	
	

}
