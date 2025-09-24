package dsa_sheet_Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baseliberary;
import dsa_sheet_pages.Profile_edit_page;

public class Profile_edit_Test extends Baseliberary
{
	Profile_edit_page obj;
	
	@BeforeTest
	public void launchSheeturl()
	{
		String path ="C:\\Users\\Apna College\\eclipse-workspace\\Apna_college_Automation_Script\\TestData\\URL.properties";
		launchSheetURL(getpropdata(path, "sheeturl"));
		obj = new Profile_edit_page();
	}
	@Test(priority=1)
	public void clickonsignIN() throws InterruptedException 
	{
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
		obj.OpenProfile();
		Thread.sleep(500);
	}
	@Test(priority = 4)
	public void clickonEditProfile() throws InterruptedException
	{
		obj.clickonEditprofile();
		Thread.sleep(1000);
	}
	@Test(priority = 5)
	public void enter_Name() throws InterruptedException
	{
		obj.Enter_name();
		Thread.sleep(500);
	}
	@Test(priority = 6)
	public void enterUserName() throws InterruptedException
	{
		obj.enterUsername();
		Thread.sleep(500);
	}
	@Test(priority = 7)
	public void enter_Mobile_Num() throws InterruptedException
	{
		obj.enter_mobile_num();
		Thread.sleep(500);
	}
	@Test(priority = 8)
	public void enterBio() throws InterruptedException
	{
		obj.enterbio();
		Thread.sleep(500);
	}
	@Test(priority = 9)
	public void enterCodeForce() throws InterruptedException
	{
		obj.enterCodeforce();
		Thread.sleep(500);
	}
	@Test(priority = 10)
	public void enterGithubUrl() throws InterruptedException
	{
		obj.enterGithub();
		Thread.sleep(500);
	}
	@Test(priority = 11)
	public void enterLeetCode() throws InterruptedException
	{
		obj.enterLeetcode();
		Thread.sleep(500);
	}
	@Test(priority = 12)
	public void enterLinkedin() throws InterruptedException
	{
		obj.enterlinkedin();
		Thread.sleep(500);
	}
	@Test(priority = 13)
	public void clickOnInstiution() throws InterruptedException
	{
		obj.clickoninstiution();
		Thread.sleep(500);
	}
	@Test(priority = 14)
	public void select_Degree() throws InterruptedException
	{
		obj.Select_degree();
		Thread.sleep(500);
	}
	@Test(priority = 15)
	public void selectbranch() throws InterruptedException
	{
		obj.selectBranch();
		Thread.sleep(500);
	}
	@Test(priority = 16)
	public void StartedMonth() throws InterruptedException
	{
		obj.Startedmonth();
		Thread.sleep(500);
	}
	@Test(priority = 17)
	public void StartedYear() throws InterruptedException  
	{
		obj.Startedyear();
		Thread.sleep(500);
	}
	@Test(priority = 18)
	public void endMonth() throws InterruptedException  
	{
		obj.endmonth();
		Thread.sleep(500);
	}
	@Test(priority = 19)
	public void endYear() throws InterruptedException  
	{
		obj.endyear();
		Thread.sleep(500);
	}
	@Test(priority = 20)
	public void OpenAnothereduPage() throws InterruptedException  
	{
		obj.Openanotheredupage();
		Thread.sleep(500);
	}
	@Test(priority = 21)
	public void closeAnothereduPage() throws InterruptedException 
	{
		obj.closeanotheredupage();
		Thread.sleep(500);
	}
	@Test(priority = 22)
	public void entertitle() throws InterruptedException
	{
		obj.enterTitle();
	}
	@Test(priority = 23)
	public void employeeType() throws InterruptedException
	{
		obj.employeetype();
	}
	@Test(priority = 24)
	public void enterCompany()
	{
		obj.entercompany();
	}
	@Test(priority = 25)
	public void clickonToggle() throws InterruptedException
	{
		obj.clickontoggle();
	}
	@Test(priority = 26)
	public void selectjobStartedmonth() throws InterruptedException
	{
		Thread.sleep(1500);
		obj.selectjobstartedmonth();
	}
	@Test(priority = 27)
	public void selectjobStartedyear() throws InterruptedException
	{
		Thread.sleep(1000);
		obj.selectjobstartedyear();
	}
	@Test(priority = 28)
	public void selectjobEndmonth() throws InterruptedException
	{
		Thread.sleep(1000);
		obj.selectjobendmonth();
	}
	@Test(priority = 29)
	public void selectjobendyear() throws InterruptedException
	{
		Thread.sleep(1000);
		obj.selectjobendyear();
	}
	@Test(priority = 30)
	public void enterlocation()
	{
		obj.enterLocation();
	}
	@Test(priority = 31)
	public void selectlocationtype()
	{
		obj.selectLocationtype();
	}
	@Test(priority = 32)
	public void clickonanotherexp() throws InterruptedException
	{
		obj.clickonAnotherexp();
	}
	@Test(priority = 33)
	public void Uploadresume() throws InterruptedException
	{
		obj.uploadresume();
	}
	@Test(priority = 33)
	public void enterSkills() throws InterruptedException
	{
		Thread.sleep(1000);
		obj.enterskills();
	}
	@Test(priority = 34)
	public void clickonsavebutton() throws InterruptedException
	{
		Thread.sleep(500);
		obj.clickonsavebutton();
	}
}	






