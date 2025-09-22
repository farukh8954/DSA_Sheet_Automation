package dsa_sheet_Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baseliberary;
import dsa_sheet_pages.Login_page;

public class Login_test extends Baseliberary
{
	Login_page obj;
	
	@BeforeTest
	public void launchSheeturl()
	{
		String path ="C:\\Users\\Apna College\\eclipse-workspace\\Apna_college_Automation_Script\\TestData\\URL.properties";
		launchSheetURL(getpropdata(path, "sheeturl"));
		obj = new Login_page();
	}
	@Test(priority=1)
	public void clickonsignIN() 
	{
		obj.Clickon_signin();
	}
	@Test(priority = 2)
	public void Login()
	{
		obj.login();
	}
}
