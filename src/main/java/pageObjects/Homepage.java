package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helper.Utility;

public class Homepage {
	
	 WebDriver driver;
public Homepage(WebDriver driver)
{
this.driver = driver;
}

By username = By.xpath("//input[@type='email']");
By password = By.xpath("//input[@type='password']");
By Login = By.xpath("//button[text()='Sign in']");
By errormsg = By.xpath("//h2[@class='errorMessage']");
By course = By.xpath("(//h2[@class='name'])[1]");


public LoginPage Login(String user, String pass)
{
	driver.findElement(username).sendKeys(user);
	driver.findElement(password).sendKeys(pass);
	Utility.waitforseconds(3);
	driver.findElement(Login).click();
	LoginPage login = new LoginPage(driver);
       return login;


}

public String capturerrormessage()
{
	String msg = driver.findElement(errormsg).getText();
	return msg;
	
}

public String successfullogin()
{
	String cypress = driver.findElement(course).getText();
	return cypress;
}


	
}
