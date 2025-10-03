package dsa_sheet_Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baseliberary;
import dsa_sheet_pages.Dsa_sheet_main_page;

public class Dsa_sheet_mainpagetest extends Baseliberary
{
	Dsa_sheet_main_page obj;
	
	@BeforeTest
	public void launchSheeturl()
	{
		String path ="C:\\Users\\Apna College\\eclipse-workspace\\Apna_college_Automation_Script\\TestData\\URL.properties";
		launchSheetURL(getpropdata(path, "sheeturl"));
		obj = new Dsa_sheet_main_page();
	}
	@Test(priority=1)
	public void clickonsignIN() 
	{
		obj.Clickon_signin();
	}
	@Test(priority = 2)
	public void login()
	{
		obj.login();
	}
	@Test(priority = 3)
	public void clickonLeftSideOption() throws InterruptedException
	{
		obj.clickonLeftsideOption();
	}
	@Test(priority = 4)
	public void VerifyComapnywiseSheet() throws InterruptedException
	{
		obj.VerifyComapnyWiseSheet();
	}
	@Test(priority = 5)
	public void clickonCompanyWiseSheet() throws InterruptedException
	{
		obj.clickonCompanywiseSheet();
	}
	@Test(priority = 6)
	public void clickonCodebuddy() throws InterruptedException
	{
		obj.clickonCodeBuddy(); 
	}
	@Test(priority = 7)
	public void ClickonsavedButton()
	{
		obj.ClickonSavedButton();
	}
	@Test(priority = 8)
	public void ShowSaveQuestion()
	{
		obj.ShowSaveQuestion();
	}
	@Test(priority = 9)
	public void openQuestion() throws InterruptedException
	{
		Thread.sleep(1000); 
		obj.openQuestion();
	}
	@Test(priority = 10)
	public void ClickonCheckBox() 
	{
		obj.ClickonCheckBox();
	}
	@Test(priority = 11)
	public void clickonArticles() throws InterruptedException
	{
		obj.click_on_Article();
	}
	@Test(priority = 12)
	public void clickonYT() throws InterruptedException 
	{
		obj.clickonYT();
	}
	@Test(priority = 13)
	public void clickonpractice() throws InterruptedException
	{
		obj.clickonPractice();
	}
	@Test(priority = 14)
	public void clickonTimer() throws InterruptedException
	{
		obj.clickonTimer();
	}
	@Test(priority = 15)
	public void saveQUestion() throws InterruptedException
	{
		Thread.sleep(1000);
		obj.saveQuestion();
	}
}
