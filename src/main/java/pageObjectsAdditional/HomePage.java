package pageObjectsAdditional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By nav = By.xpath("(//*[local-name()='svg'])[2]");
	
	By home = By.xpath("//div[text()='Home']");
	
	By Login = By.xpath("//button[text()='Log in']");
	
	public void clickOnLogin()
	{
		driver.findElement(nav).click();
		driver.findElement(home).click();
		
	}
}
