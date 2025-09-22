package dsa_sheet_Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baseliberary;
import dsa_sheet_pages.DSA_sheet_headerPage;

public class DSA_sheet_HeaderTest extends Baseliberary
{
	DSA_sheet_headerPage obj;
	@BeforeTest
	public void launchSheeturl()
	{
		String path ="C:\\\\Users\\\\Apna College\\\\eclipse-workspace\\\\Apna_college_Automation_Script\\\\TestData\\\\URL.properties";
		launchSheetURL(getpropdata(path, "sheeturl"));
		obj = new DSA_sheet_headerPage();
	}
	@Test(priority=1)
	public void clickonsignIN() throws InterruptedException
	{
		Thread.sleep(1000);
		obj.Clickon_signin();
	}
	@Test(priority = 2)
	public void Login() throws InterruptedException
	{
		Thread.sleep(1000);
		obj.login();
	}
	@Test(priority = 3)
	public void clickoncourses() throws InterruptedException
	{
		Thread.sleep(1000);
		obj.clickoncourses();
	}
	@Test(priority=4)
	public void clickonAlpha6() throws InterruptedException
	{
		Thread.sleep(1000);
		obj.clickonalpha6();
	}
	@Test(priority=5)
	public void clickonDelta7() throws InterruptedException 
	{
		Thread.sleep(1000);
		obj.clickondelta7();
	}
	@Test(priority = 6)
	public void clickonSigma_9() throws InterruptedException 
	{
		Thread.sleep(1000);
		obj.clickonsigma9();
	}
	@Test(priority = 7)
	public void clickonResource() throws InterruptedException
	{
		Thread.sleep(1000);
		obj.clickonresources();
	}
	@Test(priority = 8)
	public void clickonDsaSheet() throws InterruptedException  
	{
		Thread.sleep(1000);
		obj.clickondsaSheet();
	}
	@Test(priority = 9)
	public void testSearchBar() throws InterruptedException  
	{
		Thread.sleep(1000);
		obj.testsearchBar();
	}
	@Test(priority = 10)
	public void checkNotifications() throws InterruptedException
	{
		Thread.sleep(1000);
		obj.checknotifications();
	}
	@Test(priority = 11)
	public void checkDarkmodebutton() throws InterruptedException 
	{
		Thread.sleep(1000);
		obj.checkDarkmodebutton();
	}
	@Test(priority = 12)
	public void chekcodingStreak() throws InterruptedException 
	{
		Thread.sleep(1000);
		obj.chekcodingstreak();
	}
	@Test(priority = 13)
	public void clickonProfileLogo() throws InterruptedException 
	{
		Thread.sleep(1000);
		obj.clickonProfilelogo();
	}
	@Test(priority = 14)
	public void clickonprofiledropdown() throws InterruptedException 
	{
		Thread.sleep(1000);
		obj.clickonprofiledropdown();
	}
}

