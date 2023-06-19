package dataProvider;

import org.testng.annotations.DataProvider;

public class CustomDataProvider1 {
	
	@DataProvider(name="Credentials")
	public static Object[][] test2()
	{
		
		Object arr[][] = ExcelReader.getDataFromSheet("LoginNew");
		return arr;
		
	}
}
