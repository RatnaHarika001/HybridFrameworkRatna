package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import browserFactory.browserFactory;
import dataProvider.ConfigReader;
import helper.Utility;

public class BaseClass {
	
	public WebDriver driver;
	

	@BeforeClass
	public void setup()
	{
		System.out.println("LOG:INFO - Before Class Executing-Setting up Browser");
		driver = browserFactory.startbrowser(ConfigReader.getProperty("Browser"), ConfigReader.getProperty("qaEnv"));
		
		
	}
	
   // @AfterClass
	public void teardown()
	{
		browserFactory.closebrowser(driver);
		System.out.println("LOG:INFO - After Class Executing-Closing Browser");
	}
    
    

}
