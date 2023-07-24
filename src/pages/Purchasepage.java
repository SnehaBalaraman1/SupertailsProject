package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Purchasepage {
	
	ChromeDriver driver;
	
	By cart=By.xpath("//*[@id=\"HeaderCartTrigger\"]");
	By checkout=By.xpath("//*[@id=\"CartPageForm\"]/div[1]/div[3]/div[5]/div[2]/button");
	By address=By.xpath("//*[@id=\"checkout_shipping_address_address1\"]");
	By apartment=By.xpath("//*[@id=\"checkout_shipping_address_address2\"]");
    By city=By.xpath("//*[@id=\"checkout_shipping_address_city\"]");
    By state=By.xpath("//*[@id=\"checkout_shipping_address_province\"]");
    By pin=By.xpath("//*[@id=\"checkout_shipping_address_zip\"]");
    By phone=By.xpath("//*[@id=\"checkout_shipping_address_phone\"]");
    By shipping=By.xpath("//*[@id=\"continue_button\"]");
    
    public Purchasepage(ChromeDriver driver) {
		// TODO Auto-generated constructor stub
    	this.driver=driver;
	}
	public void clickcart()
    {
    	driver.findElement(cart).click();
    	driver.findElement(checkout).click();
    }
    public void setvalues(String adrs,String aprtmnt,String ct)
    {
    	driver.findElement(address).sendKeys(adrs);
    	driver.findElement(apartment).sendKeys(aprtmnt);
    	driver.findElement(city).sendKeys(ct);
    }
    public void dropdown()
    {
    	WebElement st=driver.findElement(state);
    	Select s=new Select(st);
    	s.selectByVisibleText("Kerala");
    			
    }
    public void num(String pincod,String ph)
    {
    	driver.findElement(pin).sendKeys(pincod);
    	driver.findElement(phone).sendKeys(ph);
    	
    	
    }
    public void clickship()
    {
    	driver.findElement(shipping).click();
    }
}
