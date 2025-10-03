package dsa_sheet_pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baseliberary;

public class DaysPage extends Baseliberary
{
	public DaysPage() {
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
	@FindBy(xpath = "//div[@class=\"flex justify-between items-center px-4 py-3 cursor-pointer\"]")
	private List<WebElement> Days;
	@FindBy(xpath = "//input[@type=\"checkbox\"]")
	private List<WebElement> checkboxs;
	@FindBy(xpath = "//div[@class=\"w-full flex justify-between\"]//p[text()='Day 1 : Array (Part 1)']")
	private WebElement Day1;
	@FindBy(xpath = "//div[@title=\"Article\"]")
	private List<WebElement> Article;
	@FindBy(xpath = "//p[text()='DSA Sheet']")
	private WebElement dsa_sheet;
	@FindBy(xpath = "//a[@class=\"text-white hover:text-blue-400 flex justify-center\"]")
	private List<WebElement> youtube;
	@FindBy(xpath = "//img[@alt=\"Practice\"]")
	private List<WebElement> practice;
	@FindBy(xpath = "//div[@class=\"h-[64px] mx-auto dark:border-l-[#313336] border-l-[#E5E7EB] flex justify-center items-center cursor-pointer\"]")
	private List<WebElement> SaveQue;
	@FindBy(xpath = "//button[text()='Back to DSA Sheet']")
	private WebElement Backtodsa;
	
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
	public void clickonday1Close()
	{
		waitforclick(Day1);
	}
	public void Allcheck()
	{
		try 
		{
			
			for(int i=0;i<Days.size();i++)
			{
				WebElement ele =Days.get(i);
				waitforvisiblity(ele);
				actionclick(ele);
				try 
				{
					for(int j=0;j<checkboxs.size();j++)
					{
						if (j==0) 
						{
							continue;
						}
						else
						{
							WebElement elem =checkboxs.get(j);
							waitforclick(elem);
						}
					}
					actionclick(ele);
				}
				catch (Exception e) 
				{
					System.out.println("Exception in checkbox" + e);
				}
			}
		}
		catch (Exception e) 
		{
			System.out.println("Exception" + e);
		}
	}
	public void AllArticle() throws InterruptedException
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
		public void Allyoutube()
		{
			try 
			{
				for(int i=0;i<Days.size();i++)
				{
					WebElement ele =Days.get(i);
					waitforvisiblity(ele);
					actionclick(ele);
					try 
					{
						for(int j=0;j<youtube.size();j++)
						{
							WebElement elem =youtube.get(j);
							scrollele(elem);
							Thread.sleep(500);
							closeNewTab(elem);
						}
					actionclick(ele);
					} 
					catch (Exception e) 
					{
						System.out.println("Exception in Youtube" + e);
					}
				}
			}
			catch (Exception e) 
			{
				System.out.println("Exception in Youtube" + e);
			}
		}
		public void Allpractice()
		{
			try 
			{ 
				for(int i=0;i<Days.size();i++)
				{
					WebElement ele =Days.get(i);
					waitforvisiblity(ele);
					actionclick(ele);	
				try 
				{
					for(int j=0;j<practice.size();j++)
					{
						WebElement elem =practice.get(j);
						scrollele(elem);
						Thread.sleep(1000);
						closeNewTab(elem);
					}
					actionclick(ele);
				}	
				catch (Exception e) 
					{
						System.out.println("Exception in practice" + e);
					}
				}
			}
			catch (Exception e) 
			{
				System.out.println("Exception in Save" + e);
			}
		}
		public void AllsaveQue()
		{
				try 
				{
					for(int i=0;i<Days.size();i++)
					{
						WebElement ele =Days.get(i);
						waitforvisiblity(ele);
						actionclick(ele);
						try 
						{
							for(int j=0;j<SaveQue.size();j++)
							{
								WebElement elem =SaveQue.get(j);
								scrollele(ele);
								actionclick(elem);
							}
						} 
						catch (Exception e) 
						{
							System.out.println("Exception in Save" + e);
						}
						waitforclick(ele);
					}
				}
				catch (Exception e) 
			{
				System.out.println("Exception" + e);
			}
		}
}
