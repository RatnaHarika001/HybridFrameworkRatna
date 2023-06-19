package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ManagePage {
	
	WebDriver driver;
	
	public ManagePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	By manage = By.xpath("//span[text()='Manage']");
	By course = By.xpath("//a[contains(@href,'course')]");
	
	public void ManagePage()
	{
		Actions act = new Actions(driver);
		WebElement manage1 = driver.findElement(manage);
		act.moveToElement(manage1).perform();
		driver.findElement(course).click();

		
	}

}
































