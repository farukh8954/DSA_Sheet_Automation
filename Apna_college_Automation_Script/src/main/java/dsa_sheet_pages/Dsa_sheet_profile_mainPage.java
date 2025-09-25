package dsa_sheet_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baseliberary;

public class Dsa_sheet_profile_mainPage extends Baseliberary
{
	public Dsa_sheet_profile_mainPage() 
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//p[text()='Sign In']")
	private WebElement signin;
	@FindBy(xpath = "//input[@type=\"email\"]")
	private WebElement Email;
	@FindBy(xpath = "//input[@placeholder=\"Password\"]")
	private WebElement password;
	@FindBy(xpath = "//button[text()=\"Sign In\"]")
	private WebElement login;
	@FindBy(xpath = "//img[@class=\" h-[36px] w-[36px] cursor-pointer rounded-full\"]")
	private WebElement profile_logo;
	@FindBy(xpath = "//div[@class=\"desktop:col-span-9 col-span-1\"]//div[@class=\"relative flex items-center bg-white dark:bg-[#191A1E] w-[50px] h-[26px] rounded-full cursor-pointer border border-gray-300 dark:border-[#313336] mt-1\"]")
	private WebElement Toggle;
	@FindBy(xpath = "(//div[@class=\"flex gap-2\"]//*[local-name()='svg'])[1]")
	private WebElement previous_month;
	@FindBy(xpath = "(//div[@class=\"flex gap-2\"]//*[local-name()='svg'])[2]")
	private WebElement nextMonth;
	@FindBy(xpath ="//span[text()='Weekly']")
	private WebElement openweekly;
	@FindBy(xpath ="//button[text()='Weekly']")
	private WebElement selWeekly;
	@FindBy(xpath="//button[text()='Monthly']")
	private WebElement selMonthly;
	@FindBy(xpath="//button[text()='Till Now']")
	private WebElement selTillnow;
	@FindBy(xpath = "//button[@class=\"hover:dark:text-white transition-all duration-200\"]")
	private WebElement preweek;
	@FindBy(xpath = "//button[@class=\"hover:text-white transition-all duration-200\"]")
	private WebElement nextWeek;
	@FindBy(xpath = "//a[text()='Add Experience']")
	private WebElement Addexp;
	@FindBy(xpath = "//a[text()='Add Education']")
	private WebElement Addedu;
	@FindBy(xpath="//a[text()='Add Codeforce Link']")
	private WebElement Addcodeforce;
	@FindBy(xpath = "//a[text()='Add Linkedin Link']")
	private WebElement AddLinked;
	@FindBy(xpath = "(//div[@class=\"flex justify-between items-center mb-3\"]//*[local-name()='svg'])[2]")
	private WebElement AddNote;
	@FindBy(xpath = "//div[@class=\"text-2xl heading\"]")
	private WebElement Noteheadline;
	@FindBy(xpath = "//div[@id=\"codeEditor\"]")
	private WebElement Writenote;
	@FindBy(xpath = "//div[@class=\"flex items-center mobile:gap-1 gap-2\"]/..//*[local-name()='svg' and contains (@class, 'lucide')]")
	private WebElement closeNote;
	@FindBy(xpath = "//div[text()='See All']")
	private WebElement allNote;
	@FindBy(xpath = "//input[@placeholder=\"Search\"]")
	private WebElement searchnote;
	@FindBy(xpath = "(//div//*[local-name()='svg' and contains(@class,'lucide-x')])[2]")
	private WebElement closeallnotes;
	@FindBy(xpath = "//a[@href=\"/profile/code-buddies\"]")
	private WebElement codebuddyList;
	@FindBy(xpath = "//input[@placeholder=\"Search User\"]")
	private WebElement searchcodebuddy;
	@FindBy(xpath = "//button[text()='View Detail']")
	private WebElement ViewDetail;
	@FindBy(xpath = "//button[@aria-label=\"Close\"]")
	private WebElement closeBuddy;
	@FindBy(xpath = "//a[text()='Dashboard']")
	private WebElement BacktoDash;
	
	public void Clickon_signin()
	{
		actionclick(signin);
	}
	public void login() 
	{
		String path = "C:\\Users\\Apna College\\eclipse-workspace\\Apna_college_Automation_Script\\TestData\\Login credentials.xlsx";
		waitforclick(Email);
		waitforSendkeys(Email,GetExceldata(path, 0, 1, 4));
		waitforclick(password);
		waitforSendkeys(password,GetExceldata(path, 0, 2, 4));
		waitforclick(login);
	}
	public void openprofile()
	{
		waitforvisiblity(profile_logo);
		waitforclick(profile_logo);
	}
	public void clickonIdealProfile() throws InterruptedException
	{
		waitforvisiblity(Toggle);
		waitforclick(Toggle);
		Thread.sleep(1000);
		waitforclick(Toggle);
	}
	public void clickonprevMonth()
	{
		waitforvisiblity(previous_month);
		waitforclick(previous_month);
	}
	public void clickOnNextmonth()
	{
		waitforvisiblity(nextMonth);
		waitforclick(nextMonth);
	}
	public void clickonprevWeekData()
	{
		waitforvisiblity(preweek);
		waitforclick(preweek);
	}
	public void clickonNextWeekData()
	{
		waitforvisiblity(nextWeek);
		waitforclick(nextWeek);
	}
	public void clickonAddexperiance() throws InterruptedException
	{
		scrollele(Addexp);
		waitforvisiblity(Addexp);
		waitforclick(Addexp);
		Thread.sleep(500);
		
	}
	public void clickonAddEducation() throws InterruptedException
	{
		waitforvisiblity(Addedu);
		waitforclick(Addedu);
		Thread.sleep(500);
		
	}
	public void clickonAddCodeForce() throws InterruptedException
	{
		waitforvisiblity(Addcodeforce);
		waitforclick(Addcodeforce);
		Thread.sleep(500);
		
	}
	public void clickonAddLinkedin() throws InterruptedException
	{
		waitforvisiblity(AddLinked);
		waitforclick(AddLinked);
		Thread.sleep(500);
		scrollele(BacktoDash);
		waitforclick(BacktoDash);
	}
	public void addnote()
	{
		waitforvisiblity(AddNote);
		waitforclick(AddNote);
		waitforvisiblity(Noteheadline);
		waitforclick(Noteheadline);
		waitforSendkeys(Noteheadline, "Automation");
		waitforvisiblity(Writenote);
		waitforclick(Writenote);
		waitforSendkeys(Writenote, "hi my name is farukh");
		waitforvisiblity(closeNote);
		waitforclick(closeNote);
	}
	public void clickonseeAllNotes()
	{
		waitforvisiblity(allNote);
		waitforclick(allNote);
		waitforvisiblity(searchnote);
		waitforclick(searchnote);
		waitforSendkeys(searchnote, "hi");
		waitforvisiblity(closeallnotes);
		waitforclick(closeallnotes);
	}
	public void SeeAllCodebuddyList() throws InterruptedException
	{
		Thread.sleep(1000);
		scrollele(codebuddyList);
		Thread.sleep(1000);
		waitforvisiblity(codebuddyList);
		waitforclick(codebuddyList);
		waitforvisiblity(searchcodebuddy);
		waitforclick(searchcodebuddy);
		waitforSendkeys(searchcodebuddy, "Ashvini");
		waitforvisiblity(ViewDetail);
		waitforclick(ViewDetail);
		Thread.sleep(1000);
		waitforclick(closeBuddy);
		waitforvisiblity(BacktoDash);
		waitforclick(BacktoDash);
	}
}
