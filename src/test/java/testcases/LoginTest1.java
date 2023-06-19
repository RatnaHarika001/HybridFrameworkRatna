package testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pageObjects.LoginPage;
import pageObjects.LoginPage1;
import pageObjects.RegisterPage;

public class LoginTest1 extends BaseClass {

	@Test
   public void loginToApplicationWithNonExistingUser()
   {
	   LoginPage1 login = new LoginPage1(driver);
	   RegisterPage page =  login.clickonNewUserLink();
	   page.createuser();
	   Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='Sign In']")).isDisplayed());
	   login.logintoApplication("ratna12@gmail.com", "test123");
	   
	   
	   
   }
}
