package tests;

import java.time.Duration;

import org.testng.annotations.Test;

import base.Baseclass;
import pages.Productselectionpage;
import pages.Purchasepage;
import pages.Suptailsloginpage;

public class Purchasetest extends Baseclass {
	
	@Test
	public void test() throws InterruptedException
	
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
		
		Purchasepage ob1=new Purchasepage(driver);
		
		 Productselectionpage obj=new Productselectionpage(driver);
		 Suptailsloginpage ob=new Suptailsloginpage(driver);
			ob.login();
			Thread.sleep(7000);
			ob.setvalues("Arya","Jose","aryayu@gmail.com", "aryayu123");
			
			ob.signin();
		 Thread.sleep(19000);
		 obj.mousehover();
		 obj.clickproduct();
		 Thread.sleep(17000);
		ob1.clickcart();
		ob1.setvalues("rose villa", "04", "kochi");
		ob1.dropdown();
		ob1.num("683516", "9871223456");
		ob1.clickship();
		Thread.sleep(16000);
		Thread.sleep(19000);
	}
	

}
