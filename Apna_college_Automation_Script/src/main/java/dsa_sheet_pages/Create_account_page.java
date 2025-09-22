package dsa_sheet_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baseliberary;

public class Create_account_page extends Baseliberary
{
	public Create_account_page() 
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//p[text()='Sign In']")
	private WebElement signin;
	@FindBy(xpath = "//*[text()=\"New user? Create account\"]")
	private WebElement newuser;
	@FindBy(xpath = "//input[@placeholder=\"Username\"]")
	private WebElement username;
	@FindBy(xpath = "//input[@placeholder=\"Email Address\"]")
	private WebElement Email;
	@FindBy(xpath = "//input[@placeholder=\"Password\"]")
	private WebElement password;
	@FindBy(xpath = "//input[@placeholder=\"Confirm Password\"]")
	private WebElement Confirmpassword;
	@FindBy(xpath = "//button[text()=\"Create Account\"]")
	private WebElement CreateAccount;
	
	public void Clickon_signin()
	{
		waitforclick(signin);
	}
	public void CreatenewAccount() 
	{
		waitforclick(newuser);
		waitforclick(username);
		waitforSendkeys(username, "farukh ahmad");
		waitforclick(Email);
		waitforSendkeys(Email, "qwerty@gmail.com");
		waitforclick(password);
		waitforSendkeys(password, "far@1234");
		waitforclick(Confirmpassword);
		waitforSendkeys(Confirmpassword, "far@1234");
		waitforclick(CreateAccount);
	}
	
}
