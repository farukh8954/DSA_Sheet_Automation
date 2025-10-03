package baselibrary;


import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import application_utility.Application_utility;
import excel_utility.Excel_utility;
import property_utility.Property_utility;
import screenshot_utility.Screenshot_utility;
import wait_utility.Wait_utility;


public class Baseliberary implements Excel_utility,Property_utility, Wait_utility,Screenshot_utility, Application_utility
{
	public static WebDriver driver;
	
	public void launchSheetURL(String url) 
	{
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get(url);
	}
	@Override
	public String GetExceldata(String path, int sheetnum, int colnum, int rownum) {
		String value = null;
		try 
		{
			FileInputStream fis = new FileInputStream(path);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheetAt(sheetnum);
			Row row = sheet.getRow(rownum);
			Cell cell = row.getCell(colnum);
			value =cell.getStringCellValue();
			wb.close();
		} 
		catch (Exception e) 
		{
			System.out.println("Data not fetch "+ e.getMessage());
		}	
		return value;
	}
	@Override
	public String getpropdata(String path, String key) 
	{
		String value = null;
		try 
		{
			FileInputStream fis = new FileInputStream(path);
			Properties prop = new Properties();
			prop.load(fis);
			value = prop.getProperty(key);
		}
		catch (Exception e) 
		{
			System.out.println("couldn't read data "+ e.getMessage());
		}
		return value;
	}
	@Override
	public void waitforclick(WebElement ele) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement elem = wait.until(ExpectedConditions.elementToBeClickable(ele));
		elem.click();
	}
	@Override
	public void waitforvisiblity(WebElement ele) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	@Override
	public void waitforSendkeys(WebElement ele, String Data) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement elem = wait.until(ExpectedConditions.visibilityOf(ele));
		elem.sendKeys(Data);
	}
	@Override
	public void alertispresent() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		
	}
	@Override
	public void getscreenshot(String foldername, String filename) 
	{
		try 
		{
			String projectlocation = System.getProperty("user.dir");
			String path = projectlocation + "//screenshot//" + foldername + "//" + filename + ".jpg";
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File(path));
			System.out.println("screenshot taken succesfully");
		}
		catch (Exception e) 
		{
			System.out.println("Couldn't take screenshot " +e.getMessage());
		}
	}
//	@AfterMethod
//	public void resultAnalysis(ITestResult result)
//	{
//		String name = result.getMethod().getMethodName();
//		if(result.getStatus()==ITestResult.SUCCESS)
//		{
//			getscreenshot("pass", name);
//		}
//		else if(result.getStatus()==ITestResult.FAILURE)
//		{
//			getscreenshot("fail", name);
//		}	
//	}
	@Override
	public void switchwindow(int index)
	{
		Set<String> handle = driver.getWindowHandles();
		ArrayList<String> list = new ArrayList<String>(handle);
		driver.switchTo().window(list.get(index));
	}
	@Override
	public void scrollele(WebElement ele) 
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", ele);
	}
	@Override
	public void waitforclear(WebElement ele) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.clear();
	}
	@Override
	public void uploadfile(String filepath)
	{
		try 
		{
			StringSelection sel = new StringSelection(filepath);
			Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
			clipboard.setContents(sel, null);
			Robot rob = new Robot();
			rob.delay(500);
			rob.keyPress(KeyEvent.VK_CONTROL);
			rob.keyPress(KeyEvent.VK_V);
			rob.keyRelease(KeyEvent.VK_V);
			rob.keyRelease(KeyEvent.VK_CONTROL);
			rob.keyPress(KeyEvent.VK_ENTER);
			rob.delay(250);
			rob.keyPress(KeyEvent.VK_ENTER);
		} 
		catch (Exception e) 
		{
			System.out.println("couldn't get file "+ e.getMessage());
		}
	}
	@Override
	public void actionclick(WebElement ele) 
	{
		Actions action = new Actions(driver);
		action.click(ele).perform();
	}
	@Override
	public void aerodown(WebElement ele) 
	{
		Actions action = new Actions(driver);
		action.click(ele).perform();
		action.sendKeys(Keys.ARROW_DOWN).perform();
		action.sendKeys(Keys.ENTER).perform();
	}
	@Override
	public void clickEnter()
	{
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).perform();
	}
	@Override
	public void closeNewTab(WebElement ele) 
	{
		 String originalWindow = driver.getWindowHandle();
	     ele.click();
	     try 
	     {
			Thread.sleep(2000);
		 } catch (InterruptedException e) 
	     {
			e.printStackTrace();
		 }
	     Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) 
	        {
	            if (!window.equals(originalWindow)) 
	            {
	                driver.switchTo().window(window);
	                driver.close(); 
	            }
	        }
	        driver.switchTo().window(originalWindow);
	}
	public static Logger log = LogManager.getLogger("Baseliberary");
	@Override
	public void loginfo(String mess) 
	{
		log.info(mess);
	}
	@Override
	public void logerror(String mess) {
		log.error(mess);
	}
	@Override
	public void logwarn(String mess) {
		log.warn(mess);
	}
	@Override
	public void logtrace(String mess) {
		log.trace(mess);
	}
	@Override
	public void logFatal(String mess) {
		log.fatal(mess);	
	}
	@Override
	public void logDebug(String mess) {
		log.debug(mess);
	}
	@Override
	public void jsclick(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement elem = wait.until(ExpectedConditions.elementToBeClickable(ele));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", elem);
		
		
	}
}
