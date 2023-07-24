package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Suptailsloginpage {
	
	ChromeDriver driver;
	
	By stlogin=By.xpath("//*[@id=\"header-sec\"]/div[1]/div/div[4]/div/div[1]/a[4]");
	By stcreat=By.xpath("//*[@id=\"customer_register_link\"]");
	By firstname=By.xpath("//*[@id=\"FirstName\"]");
	By lastname=By.xpath("//*[@id=\"LastName\"]");
	By stemail=By.xpath("//*[@id=\"Email\"]");
	By stpswd=By.xpath("//input[@id='CreatePassword']");
	By stsubmit=By.xpath("//*[@id=\"create_customer\"]/p/input");
	
	public Suptailsloginpage(ChromeDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}
	public void login()
	{
		driver.findElement(stlogin).click();
		driver.findElement(stcreat).click();
	}
	public void setvalues(String fname,String lname,String email,String password)
	{
		
	 driver.findElement(firstname).sendKeys(fname); 
	 driver.findElement(lastname).sendKeys(lname);
	 driver.findElement(stemail).sendKeys(email);	
	 driver.findElement(stpswd).sendKeys(password);
	 
	
	
	}
	
	public void signin()
	{
		driver.findElement(stsubmit).click();
		}

}
