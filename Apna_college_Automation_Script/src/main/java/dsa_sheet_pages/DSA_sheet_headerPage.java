package dsa_sheet_pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baselibrary.Baseliberary;

public class DSA_sheet_headerPage extends Baseliberary
{
	public DSA_sheet_headerPage()
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
	
	@FindBy(xpath = "//p[text()=\"Courses\"]")
	private WebElement courses;
	
	@FindBy(xpath = "//p[text()=\"Alpha Plus 6.0\"]")
	private WebElement Alpha6;
	
	@FindBy(xpath = "//p[text()=\"Delta 7.0\"]")
	private WebElement Delta7;
	
	@FindBy(xpath = "//p[text()=\"Sigma 9.0\"]")
	private WebElement sigma9;
	
	@FindBy(xpath = "//p[text()=\"Resources\"]")
	private WebElement Resources;
	
	@FindBy(xpath = "//p[text()=\"DSA sheet\"]")
	private WebElement DSAsheet;
	
	@FindBy(xpath = "//input[@data-slot=\"input\"]")
	private WebElement search;
	
	@FindBy(xpath = "//div[@class=\"relative cursor-pointer w-10 h-10 flex items-center justify-center dark:bg-[#101113] bg-[#FFFFFF] border-1.5 dark:border-[#313336] border-[#E5E7EB] rounded-full text-[#111827] dark:text-white\"]")
	private WebElement notification;
	
	@FindBy(xpath = "//div[@class=\"w-10 h-10 dark:bg-[#101113] bg-[#FFFFFF] dark:border-[#313336] border-[#E5E7EB] justify-center items-center border-1.5 rounded-full flex cursor-pointer mobile:hidden\"]")
	private WebElement darkmode;
	
	@FindBy(xpath = "//p[@class=\"text-[10px] font-semibold\"]")
	private WebElement codingStreak;
	
	@FindBy(xpath="//button[text()=\"Show Full Streak\"]")
	private WebElement fullstreark;
	
	@FindBy(xpath = "//img[@class=\" h-[36px] w-[36px] cursor-pointer rounded-full\"]")
	private WebElement profilelogo;
	
	@FindBy(xpath = "(//div[@data-slot=\"trigger\"])[4]")
	private WebElement profileDropdown;
	
	
	
	public void Clickon_signin()
	{
		waitforclick(signin);
	}
	public void login()
	{
		String path = "C:\\Users\\Apna College\\eclipse-workspace\\Apna_college_Automation_Script\\TestData\\Login credentials.xlsx";
		waitforclick(Email);
		waitforSendkeys(Email, GetExceldata(path, 0, 1, 4));
		waitforclick(password);
		waitforSendkeys(password,GetExceldata(path, 0, 2, 4));
		waitforclick(login);
	}
	public void clickoncourses()
	{
		waitforclick(courses);
	}
	public void clickonalpha6() throws InterruptedException
	{
		waitforclick(Alpha6);
		switchwindow(1);
		String ExpectedURL="https://www.apnacollege.in/alpha-plus-dsa";
		String ActualURL =driver.getCurrentUrl();
		Assert.assertEquals(ActualURL,ExpectedURL );
		System.out.println("Alpha 6.0 Matched");
		Thread.sleep(1000);
		switchwindow(0);
	}
	public void clickondelta7() throws InterruptedException
	{
		waitforclick(courses);
		waitforclick(Delta7);
		switchwindow(2);
		String ExpectedURL="https://www.apnacollege.in/course/delta-7";
		String ActualURL =driver.getCurrentUrl();
		Assert.assertEquals(ExpectedURL, ActualURL);
		System.out.println("Delta 7.0 Matched");
		Thread.sleep(1000);
		switchwindow(0);
	}
	public void clickonsigma9() throws InterruptedException
	{
		waitforclick(courses);
		waitforclick(sigma9);
		Thread.sleep(2000);
		switchwindow(3);
		String ExpectedURL="https://www.apnacollege.in/course/sigma-9";
		String ActualURL =driver.getCurrentUrl();
		Assert.assertEquals(ExpectedURL, ActualURL);
		System.out.println("Sigma 9.0 Matched");
		Thread.sleep(1000);
		switchwindow(0);
	}
	public void clickonresources()
	{
		waitforclick(Resources);
	}
	public void clickondsaSheet()
	{
		waitforclick(DSAsheet);
	}
	public void testsearchBar()
	{
		waitforclick(search);
		waitforvisiblity(search);
		waitforSendkeys(search, "amazon");
	}
	public void checknotifications() throws InterruptedException
	{
		waitforclick(notification);
	}
	public void checkDarkmodebutton()
	{
		waitforclick(darkmode);
	}
	public void chekcodingstreak()
	{
		waitforclick(darkmode);
		waitforvisiblity(codingStreak);
		waitforclick(codingStreak);
		waitforvisiblity(fullstreark);
		waitforclick(fullstreark);
		waitforvisiblity(codingStreak);
		waitforclick(codingStreak);
	}
	public void clickonProfilelogo()
	{
		waitforclick(profilelogo);
	}
	public void clickonprofiledropdown()
	{
		waitforclick(profileDropdown);
	}
	
}
