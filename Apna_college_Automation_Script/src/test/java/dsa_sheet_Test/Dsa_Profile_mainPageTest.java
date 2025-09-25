package dsa_sheet_Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baseliberary;
import dsa_sheet_pages.Dsa_sheet_profile_mainPage;

public class Dsa_Profile_mainPageTest extends Baseliberary
{
	Dsa_sheet_profile_mainPage obj;
	
	@BeforeTest
	public void launchSheeturl()
	{
		String path ="C:\\\\Users\\\\Apna College\\\\eclipse-workspace\\\\Apna_college_Automation_Script\\\\TestData\\\\URL.properties";
		launchSheetURL(getpropdata(path, "sheeturl"));
		obj = new Dsa_sheet_profile_mainPage();
	}
	@Test(priority=1)
	public void clickonsignIN() throws InterruptedException 
	{
		Thread.sleep(1000);
		obj.Clickon_signin();
		Thread.sleep(500);
	}
	@Test(priority = 2)
	public void Login() throws InterruptedException
	{
		obj.login();
		Thread.sleep(500);
	}
	@Test(priority = 3)
	public void openProFile() throws InterruptedException
	{
		obj.openprofile();
		Thread.sleep(500);
	}
	@Test(priority = 4)
	public void clickonIdealprofile() throws InterruptedException
	{
		obj.clickonIdealProfile();
		Thread.sleep(500);
	}
	@Test(priority = 5)
	public void clickonprevmonth() throws InterruptedException
	{
		obj.clickonprevMonth();
		Thread.sleep(500);
	}
	@Test(priority = 6)
	public void clickOnnextmonth() throws InterruptedException
	{
		obj.clickOnNextmonth();
		Thread.sleep(500);
	}
	@Test(priority = 7)
	public void clickonprevweekData() throws InterruptedException
	{
		obj.clickonprevWeekData();
		Thread.sleep(500);
	}
	@Test(priority = 8)
	public void clickonNextWeekData() throws InterruptedException
	{
		obj.clickonNextWeekData();
		Thread.sleep(500);
	}
	@Test(priority = 9)
	public void clickonaddexperiance() throws InterruptedException
	{
		obj.clickonAddexperiance();
		Thread.sleep(500);
	}
	@Test(priority = 10)
	public void clickonAddeducation() throws InterruptedException
	{
		obj.clickonAddEducation();
		Thread.sleep(500);
	}
	@Test(priority = 11)
	public void clickonaddCodeForce() throws InterruptedException
	{
		obj.clickonAddCodeForce();
		Thread.sleep(500);
	}
	@Test(priority = 12)
	public void clickonAddlinkedin() throws InterruptedException
	{
		obj.clickonAddLinkedin();
		Thread.sleep(500);
	}
	@Test(priority = 13)
	public void addNote() throws InterruptedException
	{
		obj.addnote();
		Thread.sleep(500);
	}
	@Test(priority = 14)
	public void clickonseeallNotes() throws InterruptedException
	{
		obj.clickonseeAllNotes();
		Thread.sleep(500);
	}
	@Test(priority = 15)
	public void SeeAllcodebuddyList() throws InterruptedException
	{
		obj.SeeAllCodebuddyList();
		Thread.sleep(500);
	}
}
