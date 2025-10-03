package dsa_sheet_Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import baselibrary.Baseliberary;
import dsa_sheet_pages.DaysPage;

public class DaysTest extends Baseliberary
{
	DaysPage obj;
	
	@BeforeTest
	public void launchSheeturl()
	{
		String path ="C:\\Users\\Apna College\\eclipse-workspace\\Apna_college_Automation_Script\\TestData\\URL.properties";
		launchSheetURL(getpropdata(path, "sheeturl"));
		obj = new DaysPage();
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
	public void clickonday1close()
	{
		obj.clickonday1Close();
	}
	@Test(priority = 4)
	public void AllCheckBox() throws InterruptedException
	{
		obj.Allcheck();
	}
	@Test(priority = 5)
	public void Allytvideos() throws InterruptedException
	{
		obj.Allyoutube();
	}
	@Test(priority = 6)
	public void Allpractice() throws InterruptedException
	{
		obj.Allpractice();
	}
	@Test(priority = 7)
	public void AllSaveQue() throws InterruptedException
	{
		obj.AllsaveQue();
	}
	@Test(priority = 3)
	public void Allarticle() throws InterruptedException
	{
		obj.AllArticle();
	}
}
