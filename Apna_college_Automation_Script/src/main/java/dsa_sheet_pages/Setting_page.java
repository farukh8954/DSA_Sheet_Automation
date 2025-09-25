package dsa_sheet_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baseliberary;

public class Setting_page extends Baseliberary
{
	public Setting_page() {
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
	@FindBy(xpath = "//img[@class=\" h-[36px] w-[36px] cursor-pointer rounded-full\"]")
	private WebElement profilelogo;
	@FindBy(xpath = "(//div[@data-slot=\"trigger\"])[4]")
	private WebElement profileDropdown;
	@FindBy(xpath = "//p[text()='Setting']")
	private WebElement setting;
	@FindBy(xpath = "//div[@class=\"flex flex-col md:flex-row items-start md:items-center mt-6 gap-6 md:gap-6\"]/label[2]//div[@class=\"w-[44px] h-6 flex items-center rounded-full p-1 duration-300 bg-[#2E80ED] dark:bg-[#F46E54]\"]")
	private WebElement EmailToggle;
	@FindBy(xpath = "//div[@class=\"flex flex-col md:flex-row items-start md:items-center mt-6 gap-6 md:gap-6\"]/label[3]//div[@class=\"w-[44px] h-6 flex items-center rounded-full p-1 duration-300 bg-[#2E80ED] dark:bg-[#F46E54]\"]")
	private WebElement whatsappToggle;
	@FindBy(xpath = "//input[@placeholder=\"Enter Current Password\"]")
	private WebElement current_password;
	@FindBy(xpath = "//input[@placeholder=\"Enter New Password\"]")
	private WebElement Newpassword;
	@FindBy(xpath = "//input[@placeholder=\"Confirm New Password\"]")
	private WebElement confirmPassword;
	@FindBy(xpath = "//button[text()='Reset']")
	private WebElement reset;
	@FindBy(xpath = "//button[text()='Save Password']")
	private WebElement savePassword;
	@FindBy(xpath = "//div[@class=\"flex flex-col md:flex-row items-center mt-3 gap-4\"]/div")
	private WebElement uploadphoto;
	@FindBy(xpath = "//div[@class=\"mobile:hidden gap-4 border-[#A1A1AA80] dark:border-[#313336]\"]//button[text()='Save Changes']")
	private WebElement savechanges;
	
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
	public void opensetting() throws InterruptedException
	{
		Thread.sleep(1000);
		waitforvisiblity(profilelogo);
		actionclick(profilelogo);
		Thread.sleep(1000);
		waitforvisiblity(profileDropdown);
		actionclick(profileDropdown);
		waitforvisiblity(setting);
		waitforclick(setting);
	}
	public void clickonEmailToggle() throws InterruptedException
	{
		waitforvisiblity(EmailToggle);
		waitforclick(EmailToggle);
	}
	public void clickonWhatsappToggle() throws InterruptedException
	{
		waitforvisiblity(whatsappToggle);
		waitforclick(whatsappToggle);
	}
	public void currentPassword()
	{
		waitforvisiblity(current_password);
		waitforclick(current_password);
		waitforSendkeys(current_password, "far@1234");
		waitforclick(reset);
		waitforSendkeys(current_password, "far@1234");
	}
	public void EnternewPassword()
	{
		waitforvisiblity(Newpassword);
		waitforclick(Newpassword);
		waitforSendkeys(Newpassword, "far@1234");
	}
	public void confirm_password()
	{
		waitforvisiblity(confirmPassword);
		waitforclick(confirmPassword);
		waitforSendkeys(confirmPassword, "far@1234");
	}
	public void clickonsavepassword()
	{
		waitforvisiblity(savePassword);
		waitforclick(savePassword);
	}
	public void uploadpic() throws InterruptedException
	{
		scrollele(uploadphoto);
		waitforvisiblity(uploadphoto);
		waitforclick(uploadphoto);
		Thread.sleep(1000);
		uploadfile("\"C:\\Users\\Apna College\\Pictures\\Screenshots\\Screenshot 2025-09-22 175242.png\"");
	}
	public void clickonSavechanges()
	{
		waitforvisiblity(savechanges);
		waitforclick(savechanges);
	}
}
