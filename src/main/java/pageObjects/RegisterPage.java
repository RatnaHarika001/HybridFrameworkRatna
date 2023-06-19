package pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helper.Utility;

public class RegisterPage {
	
	WebDriver driver;
	
	public RegisterPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	private By name = By.xpath("//input[@name='name']");
	
	private By email = By.xpath("//input[@name='email']");
	
	private By password = By.xpath("//input[@name='password']");
	
	private By interests = By.xpath("//label[@class='interest']");
	
	private By gender = By.xpath("//input[@name='gender']");
	
	private By state = By.xpath("//select[@id='state']");
	
	private By statevalues = By.xpath("//select[@name='state']/option");
	
	private By hobbies = By.xpath("//select[@id='hobbies']/option");
	
	private By Signup = By.xpath("//button[text()='Sign up']");
	
	
	public void createuser()
	{

		//WebElement name1 = driver.findElement(name);
		
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait1.until(ExpectedConditions.elementToBeClickable(name)).sendKeys("Harika1");;
		
		driver.findElement(email).sendKeys("ratnaharika10@gmail.com");
		driver.findElement(password).sendKeys("test123");
		List<WebElement> list1 = driver.findElements(interests);
		for(WebElement abc : list1)
		{
			String value = abc.getText();
			if(value.contains("Performance Testing"))
			{
				abc.click();
			}
		}
		List<WebElement> list2 = driver.findElements(gender);
		for(WebElement xyz : list2)
		{
			String value1 = xyz.getAttribute("value");
			System.out.println(value1);
			if(value1.contains("Female"))
			{
				xyz.click();
			}
		}
		driver.findElement(state).click();
		List<WebElement> list3 = driver.findElements(statevalues);
		for(WebElement pqr : list3)
		{
			String value2 = pqr.getText();
			if(value2.contains("Goa"))
			{
				pqr.click();
			}
		}
		List<WebElement> list4 = driver.findElements(hobbies);
		for(WebElement cde : list4)
		{
			String value3 = cde.getText();
			if(value3.contains("Reading"))
			{
				cde.click();
			}
		}
		Utility.JSclick(driver, Signup);
	//	driver.findElement(Signup).click();
	}

}
