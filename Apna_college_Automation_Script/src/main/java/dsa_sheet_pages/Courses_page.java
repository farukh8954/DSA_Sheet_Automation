package dsa_sheet_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baselibrary.Baseliberary;

public class Courses_page extends Baseliberary
{
	public Courses_page()
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
	public void clickoncourses() throws InterruptedException
	{
		Thread.sleep(2000);
		courses.click();
	}
	public void clickonalpha6() throws InterruptedException
	{
		Thread.sleep(2000);
		Alpha6.click();
		Thread.sleep(2000);
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
		Thread.sleep(2000);
		courses.click();
		Thread.sleep(1000);
		Delta7.click();
		Thread.sleep(2000);
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
		Thread.sleep(2000);
		courses.click();
		Thread.sleep(1000);
		sigma9.click();
		Thread.sleep(2000);
		switchwindow(3);
		String ExpectedURL="https://www.apnacollege.in/course/sigma-9";
		String ActualURL =driver.getCurrentUrl();
		Assert.assertEquals(ExpectedURL, ActualURL);
		System.out.println("Sigma 9.0 Matched");
		Thread.sleep(1000);
		switchwindow(0);
		driver.quit();
	}
	
}
