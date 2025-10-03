package dsa_sheet_pages;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baseliberary;

public class Artivle_page extends Baseliberary
	{
		public Artivle_page() 
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
		@FindBy(xpath = "(//div[@title=\"Article\"])[1]")
		private WebElement ArticlePage;
		@FindBy(xpath = "//span[@class=\"flex-1 text-sm\"]")
		private List<WebElement> days;
		@FindBy(xpath = "(//span[@class=\"flex-1 text-sm\"])[1]")
		private WebElement day;
		@FindBy(xpath = "//label[@data-disabled=\"true\"]")
		private List<WebElement> Articles;
		@FindBy(xpath = "//li[@class=\"relative\"]")
		private List<WebElement> pagedetails;
		@FindBy(xpath = "//ol[@class=\"pl-7 list-[upper-roman]\"]/li")
		private List<WebElement> methods;
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
		public void ClickonArticle()
		{
			try 
			{
				Thread.sleep(1000);
				waitforclick(ArticlePage);
				loginfo("clicked succesfully");
			} 
			catch (Exception e) 
			{
				logFatal("not clicked");
			}
		}
		public void clickedonDays() throws InterruptedException 
		{
			int Open=0;
			int notopen=0; 
			waitforclick(day);
			int totalDays =days.size();
			for(int i=0;i<totalDays;i++)
			{
				List<WebElement> daylist = days;
				WebElement elem =daylist.get(i);
				jsclick(elem);
				Thread.sleep(1000);
				for (int j = 0; j < Articles.size(); j++) 
				{
					List<WebElement> Article = Articles;
					WebElement ele = Article.get(j);
					waitforvisiblity(ele);
					String oldurl =driver.getCurrentUrl();
					jsclick(ele);
					String newURL = driver.getCurrentUrl();
					if(!oldurl.equalsIgnoreCase(newURL))
					{
						for (int k = 0; k < pagedetails.size(); k++) 
						{
							Thread.sleep(500);
							List<WebElement> pagedetail = pagedetails;
							WebElement el = pagedetail.get(k);
							waitforvisiblity(el);
							actionclick(el);
						}
						for (int l = 0; l <methods.size(); l++) 
						{
							if(l==0)
							{
								continue;
							}
							Thread.sleep(500);
							List<WebElement> method = methods;
							WebElement element = method.get(l);
							waitforvisiblity(element);
							actionclick(element);
						}
						Open++;
					}
					else
					{
						notopen++;
					}
					Thread.sleep(1000);
				}
				List<WebElement> daylist1 = days;
				WebElement elem1 =daylist1.get(i);
				jsclick(elem1);
				scrollele(elem1);
			}
			loginfo("Not open : " + notopen);
			loginfo("page open : " + Open);
		}
//		public void clickedonDays() throws InterruptedException 
//		{
//			int Open=0;
//			int notopen=0; 
//			waitforclick(day);
//			int totalDays =days.size();
//			for(int i=0;i<totalDays;i++)
//			{
//				List<WebElement> daylist = days;
//				WebElement elem =daylist.get(i);
//				jsclick(elem);
//				Thread.sleep(1000);
//				for (int j = 0; j < Articles.size(); j++) 
//				{
//					List<WebElement> Article = Articles;
//					WebElement ele = Article.get(j);
//					waitforvisiblity(ele);
//					String oldurl =driver.getCurrentUrl();
//					jsclick(ele);
//					String newURL = driver.getCurrentUrl();
//					if(!oldurl.equalsIgnoreCase(newURL))
//					{
//						Open++;
//					}
//					else
//					{
//						notopen++;
//					}
//					Thread.sleep(1000);
//				}
//				List<WebElement> daylist1 = days;
//				WebElement elem1 =daylist1.get(i);
//				jsclick(elem1);
//				scrollele(elem1);
//			}
//			loginfo("Not open : " + notopen);
//			loginfo("page open : " + Open);
//		}
}
