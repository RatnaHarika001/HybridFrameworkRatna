package Additionaltestcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseClass;
import dataProvider.CustomDataProvider1;
import pageObjects.hp1;
import pageObjects.lp1;

public class LT1 extends BaseClass {

	hp1 home;
	lp1 login;
	
	@Test(priority = 1)
	public void verifyTitle()
	{
		AssertJUnit.assertTrue(driver.getTitle().contains("Automation"));
	}
	
	@Test(priority = 2)
	public void verifySocialMediaPresense()
	{

		home=new hp1(driver);
		
		int count=home.getSocialMediaCount();
		
		AssertJUnit.assertEquals(count, 4);
	}
	
	@Test(priority = 3,dataProvider = "Credentials",dataProviderClass = CustomDataProvider1.class)
	public void loginToApplication(String usename,String password)
	{
		login=home.clickOnLogin();
		
		login.loginToApplication(usename,password);
		
		AssertJUnit.assertTrue(driver.findElement(By.xpath("//span[normalize-space()='Manage']")).isDisplayed());
		
	//home.signOutFromApplication();
		
	//AssertJUnit.assertTrue(driver.findElement(By.xpath("//h2[normalize-space()='Sign In']")).isDisplayed());
		
	}
	
	
	
}
