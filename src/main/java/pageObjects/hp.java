package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class hp {

	WebDriver driver;
	
	public hp(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	By Login = By.xpath("//button[text()='Log in']");
	By socialmediaicons = By.xpath("//a[contains(@href,'Mukesh')]");
	
	
	public lp clickonLogin()
	{
		//driver.findElement().click();
		driver.findElement(Login).click();
		lp login = new lp(driver);
		return login;
	}
	
	public int getSocialMediaCount()
	{
		return driver.findElements(socialmediaicons).size();
	}
}
