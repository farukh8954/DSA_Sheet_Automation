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
	
	public void Clickon_signin() throws InterruptedException
	{
		Thread.sleep(2000);
		signin.click();
		Thread.sleep(1000);
	}
	public void CreatenewAccount() throws InterruptedException
	{
		newuser.click();
		Thread.sleep(1000);
		username.click();
		Thread.sleep(1000);
		username.sendKeys("farukh ahmad");
		Thread.sleep(1000);
		Email.click();
		Thread.sleep(1000);
		Email.sendKeys("qwerty@gmail.com");
		Thread.sleep(1000);
		password.click();
		Thread.sleep(1000);
		password.sendKeys("far@1234");
		Thread.sleep(1000);
		Confirmpassword.click();
		Thread.sleep(1000);
		Confirmpassword.sendKeys("far@1234");
		Thread.sleep(1000);
		CreateAccount.click();
	}
	
}
