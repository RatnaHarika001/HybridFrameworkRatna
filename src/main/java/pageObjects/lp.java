package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class lp {
	
	WebDriver driver;
	
	public lp(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By Email = By.xpath("//input[@type='email']");
	By password = By.xpath("//input[@type='password']");
	By Signin = By.xpath("//button[text()='Sign in']");
	
	public void loginToApplication(String user, String pass)
	{
		driver.findElement(Email).sendKeys(user);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(Signin).click();
	}

}
