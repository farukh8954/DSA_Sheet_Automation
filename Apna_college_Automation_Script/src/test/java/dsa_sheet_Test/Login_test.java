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
		launchSheetURL("https://sheetprod.jainemo.com/");
		obj = new Login_page();
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
		Thread.sleep(5000);
		obj.login();
	}
	
}
