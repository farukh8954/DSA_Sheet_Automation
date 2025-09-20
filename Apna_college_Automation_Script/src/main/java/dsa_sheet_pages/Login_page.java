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
		signin.click();
	}
	public void login() throws InterruptedException
	{
		Thread.sleep(1000);
		Email.click();
		Thread.sleep(1000);
		Email.sendKeys("farukkk@gmail.com");
		Thread.sleep(1000);
		password.click();
		Thread.sleep(1000);
		password.sendKeys("far@1234");
		Thread.sleep(1000);
		login.click();
		Thread.sleep(1000);
	}
	
	
}
