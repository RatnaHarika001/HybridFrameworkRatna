package Additionaltestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pageObjects.Homepage;
import pageObjects.hp;
import pageObjects.lp;

public class LoginT  extends BaseClass{
	
	hp home;
	lp login;
	
	@Test(priority = 1)
	public void verifyTitle()
	{
		Assert.assertTrue(driver.getTitle().contains("Automation"));
	}
	
	@Test(priority = 2)
	public void verifySocialMediaPresence()
	{
		home = new hp(driver);
		int count = home.getSocialMediaCount();
		Assert.assertEquals(count, 4);
	}
	
	
	@Test(priority = 3)
	public void login()
	{
		hp home = new hp(driver);
		home.clickonLogin();
		
	}

}
