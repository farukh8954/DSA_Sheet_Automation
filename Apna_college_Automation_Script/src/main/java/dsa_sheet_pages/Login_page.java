package dsa_sheet_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baseliberary;

public class Login_page extends Baseliberary
{
	public Login_page() {
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
}
