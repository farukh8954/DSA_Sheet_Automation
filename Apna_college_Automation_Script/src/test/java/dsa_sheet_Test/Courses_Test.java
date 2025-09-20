package dsa_sheet_Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baseliberary;
import dsa_sheet_pages.Courses_page;

public class Courses_Test extends Baseliberary
{
	Courses_page obj;
	@BeforeTest
	public void launchSheeturl()
	{
		launchSheetURL("https://sheetprod.jainemo.com/");
		obj = new Courses_page();
	}
	@Test(priority=1)
	public void clickonsignIN() throws InterruptedException
	{
		Thread.sleep(5000);
		obj.Clickon_signin();
	}
	@Test(priority = 2)
	public void Login() throws InterruptedException
	{
		Thread.sleep(2000);
		obj.login();
	}
	@Test(priority=3)
	public void ClickonCourses() throws InterruptedException
	{
		obj.clickoncourses();
	}
	@Test(priority=4)
	public void clickonAlpha6() throws InterruptedException
	{
		obj.clickonalpha6();
	}
	@Test(priority=5)
	public void clickonDelta7() throws InterruptedException
	{
		obj.clickondelta7();
	}
	@Test(priority = 6)
	public void clickonSigma9() throws InterruptedException
	{
		obj.clickonsigma9();
	}
	
}

