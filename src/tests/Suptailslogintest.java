package tests;

import org.testng.annotations.Test;

import base.Baseclass;
import pages.Suptailsloginpage;

public class Suptailslogintest extends Baseclass {
	

	@Test
	public void test() throws Exception
	{
	
		Suptailsloginpage ob=new Suptailsloginpage(driver);
		ob.login();
		Thread.sleep(5000);
		ob.setvalues("Arya","Jose","aryakl@gmail.com", "aryakl123");
		
		ob.signin();
		Thread.sleep(4000);
		
		
	}

}
