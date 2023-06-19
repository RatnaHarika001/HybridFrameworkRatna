package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}

	By email = By.xpath("//input[@name='email1']");
	By password = By.xpath("//input[@name='password1']");
	By Login = By.xpath("//button[@type='submit']");
	By errormsg = By.xpath("//h2[@class='errorMessage']");
	By socialmediaicons = By.xpath("//a[contains(@href,'Mukesh')]");
	
	
	public ManagePage Login(String user, String pass)
	{
       driver.findElement(email).sendKeys(user);
       driver.findElement(password).sendKeys(pass);
		driver.findElement(Login).click();
		ManagePage dash = new ManagePage(driver);
		return dash;
	}
	
	public String capturerror()
	{
		String errormsg1 = driver.findElement(errormsg).getText();
		return errormsg1;
	}
	
	public int getsocialmediacons()
	{
		return driver.findElements(socialmediaicons).size();

	}


}
