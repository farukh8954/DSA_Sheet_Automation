package dsa_sheet_pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baseliberary;

public class Dsa_sheet_main_page extends Baseliberary
{
	public Dsa_sheet_main_page() 
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
	@FindBy(xpath = "//div[@class=\"jsx-e6abf088d500b110 w-full flex justify-end mobile:hidden align-center items-center\"]//*[local-name()='svg']")
	private WebElement closeLeft;
	@FindBy(xpath = "//div[@class=\"jsx-e6abf088d500b110 w-9 h-9 rounded-full bg-[#E5E7EB] dark:bg-[#313336] flex items-center justify-center\"]")
	private WebElement OpenLeft;
	@FindBy(xpath = "//span[text()='Search by company...']")
	private WebElement companySearch;
	@FindBy(xpath = "//input[@data-slot=\"input\"]")
	private WebElement Entercompanyname;
	@FindBy(xpath = "//span[text()='Company Wise Interview']")
	private WebElement CompanywiseInterview;
	@FindBy(xpath = "//p[text()='DSA Sheet']")
	private WebElement dsa_sheet;
	@FindBy(xpath = "//span[text()='Beginner']")
	private WebElement beginner;
	@FindBy(xpath = "//span[text()='CodeBuddy']")
	private WebElement codebuddy;
	@FindBy(xpath = "//button[@tabindex=\"0\"]")
	private WebElement closeCodebuddy;
	@FindBy(xpath = "(//td[@class=\"px-0 py-0 my-0 pr-3 text-center bg-[#F9FAFB] dark:bg-[#191A1E] z-10\"]//*[local-name()='svg'])[1]")
	private WebElement saveQuestion;
	@FindBy(xpath = "//span[text()='Saved Questions']")
	private WebElement ShowSaveQuestion;
	@FindBy(xpath = "//p[text()='Day 1 : Array (Part 1)']/../..//*[local-name()='svg']")
	private WebElement openCloseQuestion1;
	@FindBy(xpath = "//input[@type=\"checkbox\"]")
	private List<WebElement> checkboxs;
	@FindBy(xpath = "//div[@title=\"Article\"]")
	private List<WebElement> Article;
	@FindBy(xpath = "//a[@class=\"text-white hover:text-blue-400 flex justify-center\"]")
	private List<WebElement> youtube;
	@FindBy(xpath = "//img[@alt=\"Practice\"]")
	private List<WebElement> practice;
	@FindBy(xpath = "//p[text()=\"Resources\"]")
	private WebElement Resources;
	@FindBy(xpath = "(//button[@title=\"Start Timer\"])[1]")
	private WebElement playButton;
	@FindBy(xpath = "(//button[@title=\"Reset Timer\"])[1]")
	private WebElement ResetTimer;
	@FindBy(xpath = "//div[@class=\"flex items-center gap-1\"]/button")
	private WebElement closetimer;
	@FindBy(xpath = "//div[@class=\"h-[64px] mx-auto dark:border-l-[#313336] border-l-[#E5E7EB] flex justify-center items-center cursor-pointer\"]")
	private List<WebElement> SaveQue;
	
	public void Clickon_signin()
	{
		waitforclick(signin);
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
	public void clickonLeftsideOption() throws InterruptedException
	{
		Thread.sleep(1000);
		waitforvisiblity(closeLeft);
		waitforclick(closeLeft);
		Thread.sleep(1000);
		waitforvisiblity(OpenLeft);
		waitforclick(OpenLeft);
	}
	public void VerifyComapnyWiseSheet() throws InterruptedException
	{
		Thread.sleep(1000);
		waitforvisiblity(companySearch);
		waitforclick(companySearch);
		waitforvisiblity(Entercompanyname);
		waitforSendkeys(Entercompanyname, "Amdocs");
		Thread.sleep(1000);
		clickEnter();
	} 
	public void clickonCompanywiseSheet() throws InterruptedException
	{
		Thread.sleep(1000);
		waitforvisiblity(CompanywiseInterview);
		waitforclick(CompanywiseInterview);
		Thread.sleep(1000);
		waitforvisiblity(dsa_sheet);
		waitforclick(dsa_sheet);
	}
	public void clickon_beginner() throws InterruptedException
	{
		Thread.sleep(1000);
		waitforvisiblity(beginner);
		waitforclick(beginner);
	}
	public void clickonCodeBuddy() throws InterruptedException 
	{
		waitforvisiblity(codebuddy);
		waitforclick(codebuddy);
		Thread.sleep(1000);
		waitforvisiblity(closeCodebuddy);
		waitforclick(closeCodebuddy);
	}
	public void ClickonSavedButton()
	{
		waitforvisiblity(saveQuestion);
		waitforclick(saveQuestion);
	}
	public void ShowSaveQuestion()
	{
		waitforvisiblity(ShowSaveQuestion);
		waitforclick(ShowSaveQuestion);
		
	}
	public void openQuestion() throws InterruptedException
	{
		Thread.sleep(1000);
		
		actionclick(openCloseQuestion1);
		Thread.sleep(1000);
		actionclick(openCloseQuestion1);
	}
	public void ClickonCheckBox()
	{
		waitforclick(ShowSaveQuestion);
		for(int i=0;i<checkboxs.size();i++)
		{
			if (i==0) 
			{
				continue;
			}
			WebElement elem =checkboxs.get(i);
			elem.click();
		}
	}
	public void click_on_Article() throws InterruptedException
	{
		for(int i=0;i<Article.size();i++)
		{
			WebElement elem =Article.get(i);
			scrollele(elem);
			Thread.sleep(1000);
			waitforclick(elem);
			Thread.sleep(1000);
			waitforclick(dsa_sheet);
			Thread.sleep(1000);
		}
	}
	public void clickonYT() throws InterruptedException
	{
		for(int i=0;i<youtube.size();i++)
		{
			WebElement elem =youtube.get(i);
			scrollele(elem);
			Thread.sleep(1000);
			waitforclick(elem);
			Thread.sleep(1000);
			switchwindow(0);
			Thread.sleep(1000);
		}
	scrollele(Resources);
	}
	public void clickonPractice() throws InterruptedException
	{
		for(int i=0;i<practice.size();i++)
		{
			WebElement elem =practice.get(i);
			scrollele(elem);
			Thread.sleep(1000);
			waitforclick(elem);
			Thread.sleep(1000);
			switchwindow(0);
			Thread.sleep(1000);
		}
	}
	public void clickonTimer() throws InterruptedException
	{
		waitforclick(playButton);
		Thread.sleep(2000);
		waitforclick(ResetTimer); 
		waitforclick(closetimer);
	}
	public void saveQuestion() throws InterruptedException
	{
		for(int i=0;i<SaveQue.size();i++)
		{
			WebElement elem =SaveQue.get(i);
			scrollele(elem);
			Thread.sleep(1000);
			actionclick(elem);
		}
	}
}
