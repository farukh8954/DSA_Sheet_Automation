package dsa_sheet_Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baseliberary;
import dsa_sheet_pages.Create_account_page;

public class CreateAccount_Test  extends Baseliberary
{
	Create_account_page obj;
	@BeforeTest
	public void launchSheeturl()
	{
		launchSheetURL("https://sheetprod.jainemo.com/");
		obj = new  Create_account_page();
	}
	@Test(priority = 1)
	public void clickonSignin() throws InterruptedException
	{
		obj.Clickon_signin();
	}
	@Test(priority = 2)
	public void createNewAccount() throws InterruptedException
	{
		obj.CreatenewAccount();
	}
}
