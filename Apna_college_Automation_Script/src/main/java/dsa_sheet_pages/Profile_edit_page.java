package dsa_sheet_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baseliberary;

public class Profile_edit_page extends Baseliberary
{
	public Profile_edit_page() 
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
	@FindBy(xpath = "//img[@class=\" h-[36px] w-[36px] cursor-pointer rounded-full\"]")
	private WebElement profile_logo;
	@FindBy(xpath = "//div[@class=\"flex w-full gap-3 items-center\"]//*[local-name()='svg']")
	private WebElement Edit;
	@FindBy(xpath = "//input[@id=\"fullName\"]")
	private WebElement Name;
	@FindBy(xpath = "//input[@id=\"userName\"]")
	private WebElement username;
	@FindBy(xpath = "//input[@id=\"mobile\"]")
	private WebElement mobilenumber;
	@FindBy(xpath = "//textarea[@placeholder=\"Enter bio\"]")
	private WebElement Enterbio;
	@FindBy(xpath = "//input[@placeholder=\"Codeforce Profile\"]")
	private WebElement Codeforce;
	@FindBy(xpath = "//input[@id=\"github\"]")
	private WebElement Github;
	@FindBy(xpath = "//input[@id=\"leetcode\"]")
	private WebElement leetcode;
	@FindBy(xpath = "//input[@id=\"linkedin\"]")
	private WebElement linkedin;
	@FindBy(xpath = "//input[@placeholder=\"Search your institution\"]")
	private WebElement institution;
	@FindBy(xpath = "//div[@class=\"relative w-full\"]/button//span[text()=\"Select Degree\"]")
	private WebElement degree;
	@FindBy(xpath = "//span[text()=\"Other\"]")
	private WebElement select_other;
	@FindBy(xpath = "//input[@placeholder=\"Type your degree\"]")
	private WebElement enterDegreename;
	@FindBy(xpath = "//span[text()=\"Select Branch\"]")
	private WebElement Selectbranch;
	@FindBy(xpath = "//input[@placeholder=\"Type your branch\"]")
	private WebElement enterbranchname;
	@FindBy(xpath = "(//li[text()=\"Amity University\"])[1]")
	private WebElement clickonamity;
	@FindBy(xpath = "(//span[text()=\"Select Month\"])[1]")
	private WebElement selectStartedmonth;
	@FindBy(xpath = "//span[text()=\"April\"]")
	private WebElement startmonth;
	@FindBy(xpath = "//span[text()=\"2019\"]")
	private WebElement startyear;
	@FindBy(xpath = "(//span[text()=\"Select Year\"])[1]")
	private WebElement selectStartedyear;
	@FindBy(xpath = "//h3[text()='Education']/../following-sibling::div//label[text()='End Date']/..//span[text()='Select Month']")
	private WebElement selectendmonth;
	@FindBy(xpath = "//h3[text()='Education']/../following-sibling::div//label[text()='End Date']/..//span[text()='Select Year']")
	private WebElement selectendyear;
	@FindBy(xpath = "//span[text()=\"May\"]")
	private WebElement endmonth;
	@FindBy(xpath = "//span[text()=\"2022\"]")
	private WebElement endyear;
	@FindBy(xpath = "//button[text()=\"+ Add Another Education\"]")
	private WebElement Add_another_education;
	@FindBy(xpath ="//label[text()='Institution']/..//*[local-name()='svg']")
	private WebElement Close_another_education;
	@FindBy(xpath = "//button[text()=\"Confirm\"]")
	private WebElement Confirm;
//	Today started
	@FindBy(xpath = "//input[@placeholder=\"Ex: Retail Sales Manager\"]")
	private WebElement expTitle;
	@FindBy(xpath = "//span[text()='Select Type']")
	private WebElement Select_type;
	@FindBy(xpath = "//span[text()='Internship']")
	private WebElement internship;
	@FindBy(xpath = "//span[text()='Full Time']")
	private WebElement FullTime;
	@FindBy(xpath = "//input[@name=\"company_name\"]")
	private WebElement companyname;
	@FindBy(xpath = "//label[@class=\"relative inline-flex items-center cursor-pointer\"]")
	private WebElement Togglebutton;
	@FindBy(xpath ="//div[@id='experience_scroll_0']//label[text()='Start Date']/..//span[text()='Select Month']")
	private WebElement Startjobmonth;
	@FindBy(xpath = "//span[text()='January']")
	private WebElement selectjobMonthname;
	@FindBy(xpath = "//div[@id='experience_scroll_0']//label[text()='Start Date']/..//span[text()='Select Year']")
	private WebElement Startjobyear;
	@FindBy(xpath = "//span[text()='2021']")
	private WebElement selectjobyear;
	@FindBy(xpath = "(//div[@class=\"w-full\"])[3]")
	private WebElement jobEndmonth;
	@FindBy(xpath = "//span[text()='February']")
	private WebElement selectendjobmonth;
	@FindBy(xpath = "(//div[@class=\"w-full\"])[4]")
	private WebElement Endjobyear;
	@FindBy(xpath = "//span[text()='2025']")
	private WebElement Selectjobendyear;
	
	@FindBy(xpath = "//input[@name=\"location\"]")
	private WebElement location;
	
	@FindBy(xpath = "//span[text()=\"Select Location Type\"]")
	private WebElement LocationType;
	
	@FindBy(xpath ="//span[text()=\"on-site\"]")
	private WebElement Onsite;
	
	@FindBy(xpath = "//span[text()=\"hybrid\"]")
	private WebElement hybrid;
	
	@FindBy(xpath="//span[text()=\"remote\"]")
	private WebElement Remote;
	
	@FindBy(xpath = "//h3[text()='Experience']/../../button")
	private WebElement addanotherExp;
	
	@FindBy(xpath = "(//div[@id=\"experience_scroll_1\"]//*[local-name()='svg'])[1]")
	private WebElement closeanotherexp;
	
	@FindBy(xpath = "//input[@accept=\".pdf, .doc, .docx\"]")
	private WebElement resume;
	
	@FindBy(xpath = "//button[text()='Upload']")
	private WebElement saveresume;
	
	@FindBy(xpath = "//input[@placeholder=\"Add a skill...\"]")
	private WebElement AddSkills;
	
	@FindBy(xpath = "(//button[text()='Save Changes'])[1]")
	private WebElement saveprofile;
	
	String datapath = "C:\\Users\\Apna College\\eclipse-workspace\\Apna_college_Automation_Script\\TestData\\DSA Profile data.xlsx";
	public void Clickon_signin()
	{
		waitforclick(signin);
	}
	public void login() 
	{
		String path1 = "C:\\Users\\Apna College\\eclipse-workspace\\Apna_college_Automation_Script\\TestData\\Login credentials.xlsx";
		waitforclick(Email);
		waitforSendkeys(Email,GetExceldata(path1, 0, 1, 4));
		waitforclick(password);
		waitforSendkeys(password,GetExceldata(path1, 0, 2, 4));
		waitforclick(login);
	}
	public void OpenProfile()
	{
		waitforclick(profile_logo);
	}
	public void clickonEditprofile()
	{
		waitforvisiblity(Edit);
		actionclick(Edit);
	}
	public void Enter_name() throws InterruptedException
	{
		waitforvisiblity(Name);
		waitforclick(Name);
		Thread.sleep(1000);
		Name.clear();
		Thread.sleep(500);
		waitforSendkeys(Name, GetExceldata(datapath, 0, 0, 0));
	}
	public void enterUsername() throws InterruptedException
	{
		waitforclick(username);
		Thread.sleep(1000);
		username.clear();
		Thread.sleep(500);
		waitforSendkeys(username, GetExceldata(datapath, 0, 0, 1));
	}
	public void enter_mobile_num() throws InterruptedException
	{
		waitforclick(mobilenumber);
		Thread.sleep(1000);
		mobilenumber.clear();
		Thread.sleep(500);
		waitforSendkeys(mobilenumber, "6396209619");
	}
	public void enterbio() throws InterruptedException
	{
		waitforclick(Enterbio);
		Thread.sleep(1000);
		Enterbio.clear();
		Thread.sleep(500);
		waitforSendkeys(Enterbio, GetExceldata(datapath, 0, 0, 3));
	}
	public void enterCodeforce() throws InterruptedException
	{
		scrollele(Codeforce);
		Thread.sleep(1000);
		waitforclick(Codeforce);
		Thread.sleep(1000);
		Codeforce.clear();
		Thread.sleep(500);
		waitforSendkeys(Codeforce, GetExceldata(datapath, 0, 0, 4));
	}
	public void enterGithub() throws InterruptedException
	{
		waitforclick(Github);
		Thread.sleep(1000);
		Github.clear();
		Thread.sleep(500);
		waitforSendkeys(Github, GetExceldata(datapath, 0, 0, 5));
	}
	public void enterLeetcode() throws InterruptedException
	{
		waitforclick(leetcode);
		Thread.sleep(1000);
		leetcode.clear();
		Thread.sleep(500);
		waitforSendkeys(leetcode, GetExceldata(datapath, 0, 0, 6));
	}
	public void enterlinkedin() throws InterruptedException
	{
		waitforclick(linkedin);
		Thread.sleep(1000);
		linkedin.clear();
		Thread.sleep(500);
		waitforSendkeys(linkedin, GetExceldata(datapath, 0, 0, 7));
	}
	public void clickoninstiution() throws InterruptedException
	{
		scrollele(institution);
		waitforclick(institution);
		waitforSendkeys(institution, GetExceldata(datapath, 0, 0, 8));
		waitforclick(clickonamity);
	}
	public void Select_degree() throws InterruptedException
	{
		waitforclick(degree);
		waitforclick(select_other);
		waitforclick(enterDegreename);
		Thread.sleep(1000);
		enterDegreename.clear();
		Thread.sleep(500);
		waitforSendkeys(enterDegreename, GetExceldata(datapath, 0, 0, 9));
	}
	public void selectBranch() throws InterruptedException
	{
		waitforclick(Selectbranch);
		waitforclick(select_other);
		waitforclick(enterbranchname);
		Thread.sleep(1000);
		enterbranchname.clear();
		Thread.sleep(500);
		waitforSendkeys(enterbranchname, GetExceldata(datapath, 0, 0, 10));
	}
	public void Startedmonth()
	{
		waitforclick(selectStartedmonth);
		waitforclick(startmonth);
	}
	public void Startedyear()
	{
		waitforclick(selectStartedyear);
		waitforclick(startyear);
	}
	public void endmonth()
	{
		waitforclick(selectendmonth);
		waitforclick(endmonth);
	}
	public void endyear()
	{
		waitforclick(selectendyear);
		waitforclick(endyear);
	}
	public void Openanotheredupage()
	{
		waitforclick(Add_another_education);
	}
	public void closeanotheredupage() throws InterruptedException
	{
		waitforclick(Close_another_education);
		Thread.sleep(1500);
		waitforclick(Confirm);
	}
	
//	Today start
	public void enterTitle() throws InterruptedException
	{
		scrollele(expTitle);
		Thread.sleep(1000);
		waitforclick(expTitle);
		waitforclear(expTitle);
		waitforSendkeys(expTitle, "software engineer");
	}
	public void employeetype() throws InterruptedException
	{
		waitforclick(Select_type);
		waitforclick(internship);
		Thread.sleep(1000);
		waitforclick(internship);
		waitforclick(FullTime);
	}
	public void entercompany()
	{
		waitforclick(companyname);
		waitforSendkeys(companyname, "microsoft");
	}
	public void clickontoggle() throws InterruptedException
	{
		waitforclick(Togglebutton);
		Thread.sleep(500);
		waitforclick(Togglebutton);
	}
	public void selectjobstartedmonth()
	{
		waitforclick(Startjobmonth);
		waitforclick(selectjobMonthname);
	}
	public void selectjobstartedyear()
	{
		waitforclick(Startjobyear);
		waitforclick(selectjobyear);
	}
	public void selectjobendmonth()
	{
		waitforclick(jobEndmonth);
		waitforclick(selectendjobmonth);
	}
	public void selectjobendyear()
	{
		waitforclick(Endjobyear);
		waitforclick(Selectjobendyear);
	}
	public void enterLocation()
	{
		waitforclick(location);
		waitforSendkeys(location, "noida sec 62");
	}
	public void selectLocationtype()
	{
		waitforclick(LocationType);
		waitforclick(Remote);
	}
	public void clickonAnotherexp() throws InterruptedException
	{
		waitforclick(addanotherExp);
		Thread.sleep(1000);
		waitforclick(closeanotherexp);
		waitforclick(Confirm);
	}
	public void uploadresume() throws InterruptedException
	{
	
		scrollele(resume);
		waitforvisiblity(resume);
		actionclick(resume);
		uploadfile("file:///C:/Users/Apna%20College/Documents/Hi%20my%20name%20is%20Faruk1.pdf");
		Thread.sleep(1000);
		actionclick(saveresume);
	}
	public void enterskills()
	{
		waitforclick(AddSkills);
		waitforSendkeys(AddSkills, "java");
		aerodown(AddSkills);
	}
	public void clickonsavebutton()
	{
		scrollele(saveprofile);
		waitforvisiblity(Select_type);
		actionclick(saveprofile);
	}
}
