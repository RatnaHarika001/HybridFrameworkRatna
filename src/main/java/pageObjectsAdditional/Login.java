package pageObjectsAdditional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	WebDriver driver;
	
	public Login(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By email = By.xpath("//input[@name='email1']");
	By password = By.xpath("//input[@name='password1']");
	By Signin = By.xpath("//button[@type='submit']");
	
	public void logintoapp()
	{
		driver.findElement(email).sendKeys("admin@email.com");
		driver.findElement(password).sendKeys("admin@123");
		driver.findElement(Signin).click();
	}
}
