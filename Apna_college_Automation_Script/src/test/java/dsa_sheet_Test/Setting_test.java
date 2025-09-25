package dsa_sheet_Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import baselibrary.Baseliberary;
import dsa_sheet_pages.Setting_page;

public class Setting_test extends Baseliberary
{
	Setting_page obj;
	
	@BeforeTest
	public void launchSheeturl()
	{
		String path ="C:\\Users\\Apna College\\eclipse-workspace\\Apna_college_Automation_Script\\TestData\\URL.properties";
		launchSheetURL(getpropdata(path, "sheeturl"));
		obj = new Setting_page();
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
	public void openSetting() throws InterruptedException
	{
		obj.opensetting();
	}
	@Test(priority = 4)
	public void  clickonEmailtoggle() throws InterruptedException
	{
		obj.clickonEmailToggle();
	}
	@Test(priority = 5)
	public void clickonWhatsapptoggle() throws InterruptedException
	{
		obj.clickonWhatsappToggle();
	}
	@Test(priority = 6)
	public void currentPassword()
	{
		obj.currentPassword();
	}
	@Test(priority = 7)
	public void Enternewpassword()
	{
		obj.EnternewPassword();
	}
	@Test(priority = 8)
	public void confirmpassword()
	{
		obj.confirm_password();
	}
	@Test(priority = 9)
	public void clickonsavePassword()
	{
		obj.clickonsavepassword();
	}
	@Test(priority = 10)
	public void uploadpic() throws InterruptedException
	{
		obj.uploadpic();
	}
	@Test(priority = 11)
	public void clickonsavechanges()
	{
		obj.clickonSavechanges();
	}
}
