package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import helper.Utility;

public class hp1 {

	WebDriver driver;
	
	public hp1(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By socialMediaIcons=By.xpath("//div[@class='social-btns']//a");

	By nav=By.xpath("//*[local-name()='svg']");
	
	By signOut=By.xpath("//button[normalize-space()='Sign out']");
	
	By loginButton=By.xpath("//button[normalize-space()='Log in']");
	
	public lp1 clickOnLogin()
	{
		driver.findElement(nav).click();
		Utility.JSclick(driver, loginButton);
		//driver.findElement(loginButton).click();	
		lp1 login=new lp1(driver);
		
		return login;
		
	}
	
	public void signOutFromApplication()
	{
		 driver.findElement(nav).click();
		Utility.JSclick(driver, loginButton);
	
		
	}
	
	
	public int getSocialMediaCount()
	{
		return driver.findElements(socialMediaIcons).size();
	}
	
	
	
	
}