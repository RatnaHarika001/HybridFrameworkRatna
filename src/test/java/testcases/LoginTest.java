package testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import dataProvider.CustomDataProvider1;
import pageObjects.LoginPage;
import pageObjects.ManagePage;

public class LoginTest extends BaseClass{
	LoginPage login;
	ManagePage manage;
	
//	@Test(priority = 1)
	public void VerifyTitle()
	{
		Assert.assertTrue(driver.getTitle().contains("Automation"));
	}

	//@Test(priority = 2)
	public void socialmediaicon()
	{
         login = new LoginPage(driver);
		System.out.println(login.getsocialmediacons());
	}
	
	@Test(priority = 3, dataProvider = "Credentials", dataProviderClass = CustomDataProvider1.class)
	public void logintoApplication(String user, String pass)
	{
	  manage = login.Login(user, pass);
	  Assert.assertTrue(driver.findElement(By.xpath("//span[normalize-space()='Manage']")).isDisplayed());
	}
}
