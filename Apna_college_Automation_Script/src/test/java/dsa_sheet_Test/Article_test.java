package dsa_sheet_Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baseliberary;
import dsa_sheet_pages.Artivle_page;

public class Article_test extends Baseliberary
{
	Artivle_page obj;
	
	@BeforeTest
	public void launchSheeturl()
	{
		String path ="C:\\Users\\Apna College\\eclipse-workspace\\Apna_college_Automation_Script\\TestData\\URL.properties";
		launchSheetURL(getpropdata(path, "sheeturl"));
		obj = new Artivle_page();
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
	public void Clickonarticle()
	{
		obj.ClickonArticle();
	}
//	@Test(priority = 4)
//	public void clickedondays() throws InterruptedException 
//	{
//		obj.clickedonDays();
//	}
}
