package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage1 {
	
	protected WebDriver driver;
	
	public LoginPage1(WebDriver driver)
	{
		this.driver = driver;
	}
	
	private By email = By.xpath("//input[@name='email1']");
	
	private By password = By.xpath("//input[@name='password1']");
	
	private By Signin = By.xpath("//button[@class='submit-btn']");
	
	private By error_msg = By.xpath("//h2[@class='errorMessage']");
	
	private By newuser = By.xpath("//a[text()='New user? Signup']");
	
	public  RegisterPage clickonNewUserLink()
	{
	  driver.findElement(newuser).click();
		RegisterPage page = new RegisterPage(driver);
		return page;
	}
	
	public void logintoApplication(String user, String pass)
	{
		driver.findElement(email).sendKeys(user);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(Signin).click();
	}

	public String Captureerrormsg()
	{
		String errormsg = driver.findElement(error_msg).getText();
		return errormsg;
	}
}
