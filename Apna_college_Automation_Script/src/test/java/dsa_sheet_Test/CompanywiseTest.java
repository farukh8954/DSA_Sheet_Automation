package dsa_sheet_Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baseliberary;
import dsa_sheet_pages.CompanyWisePage;

public class CompanywiseTest extends Baseliberary
{
	CompanyWisePage obj;
	
	@BeforeTest
	public void launchSheeturl()
	{
		String path ="C:\\Users\\Apna College\\eclipse-workspace\\Apna_college_Automation_Script\\TestData\\URL.properties";
		launchSheetURL(getpropdata(path, "sheeturl"));
		obj = new CompanyWisePage();
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
	@Test(priority = 3)
	public void clickonCompayWiseSheet() throws InterruptedException
	{
		obj.clickonCompayWiseSheet();
	}
	@Test(priority = 4)
	public void clickonCompanies() throws InterruptedException
	{
		obj.clickonCompanies();
	}
}
