package dsa_sheet_pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baseliberary;

public class CompanyWisePage extends Baseliberary
{
	public CompanyWisePage() {
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
	@FindBy(xpath = "//span[text()='Company Wise Interview']")
	private WebElement CompanyWisePage;
	@FindBy(xpath = "//a[@class=\"block\"]")
	private List<WebElement> companies;
	@FindBy(xpath = "//span[text()='Product Based']")
	private WebElement productBase;
	@FindBy(xpath = "//span[text()='Service Based']")
	private WebElement serviceBase;
	@FindBy(xpath = "//div[@title=\"Notes\"]")
	private WebElement notesButton;
	@FindBy(xpath = "//span[@class=\"text-[#4d4d4d]\"]")
	private WebElement Title;
	@FindBy(xpath = "//p[@class=\"description\"]")
	private WebElement Description;
	@FindBy(xpath = "//div[@class=\"flex items-center mobile:gap-1 gap-2 mobile:w-full mobile:justify-between\"]//*[local-name()='svg' and contains (@class, 'lucide')]")
	private WebElement close;
	
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
	public void clickonCompayWiseSheet() throws InterruptedException
	{
		Thread.sleep(500);
		waitforvisiblity(CompanyWisePage);
		waitforclick(CompanyWisePage);
	}
	public void clickonCompanies() throws InterruptedException
	{
		int productbaseCompany =companies.size();
		for(int i=0;i<productbaseCompany;i++)
		{
			List<WebElement> Company = companies;
			WebElement elem =Company.get(i);
			jsclick(elem);
			Thread.sleep(1000);
		}
		waitforclick(productBase);
		Thread.sleep(1000);
		waitforvisiblity(serviceBase);
		waitforclick(serviceBase);
		Thread.sleep(1000);
		int ServicebaseCompany =companies.size();
		for(int i=0;i<ServicebaseCompany;i++)
		{
			List<WebElement> Company = companies;
			WebElement elem =Company.get(i);
			jsclick(elem);
			Thread.sleep(500);
		}
	}
}
