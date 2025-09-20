package baselibrary;


import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import application_utility.Application_utility;
import excel_utility.Excel_utility;


public class Baseliberary implements Excel_utility,Application_utility
{
	public static WebDriver driver;
	
	public void launchSheetURL(String url) 
	{

	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	}

	@Override
	public String GetLoginCredentials(String path, int sheetnum, int colnum, int rownum) {
		String value = " ";
		
		return null;
	}

	@Override
	public void switchwindow(int index)
	{
		Set<String> handle = driver.getWindowHandles();
		ArrayList<String> list = new ArrayList<String>(handle);
		driver.switchTo().window(list.get(index));
		
	}
	
	
	
}
