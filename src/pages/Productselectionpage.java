package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Productselectionpage {
	
	ChromeDriver driver;
	
	By dogs=By.xpath("//*[@id=\"nav--Dogs\"]");
	By biscuits=By.xpath("//*[@id=\"nav--Biscuits & Cookies\"]");
	By biscselection=By.xpath("/html/body/div[1]/main/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/ul/li[1]/a");
	By addtocart=By.xpath("//*[@name=\"add\"]");
	By cart=By.xpath("//*[@id=\"HeaderCartTrigger\"]");
	
	public Productselectionpage(ChromeDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public void mousehover()
	{
		Actions act=new Actions(driver);
		
		 WebElement ele=driver.findElement(dogs);
		 act.moveToElement(ele);
		 act.perform();
	}
	public void clickproduct()
	{
		
		driver.findElement(biscuits).click();
		driver.findElement(biscselection).click();
		driver.findElement(addtocart).click();
		driver.findElement(cart).click();
		
	}

}
