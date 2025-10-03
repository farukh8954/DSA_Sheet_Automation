package application_utility;

import org.openqa.selenium.WebElement;

public interface Application_utility 
{
	public void switchwindow(int index);
	public void scrollele(WebElement ele);
	public void uploadfile(String filepath);
	public void actionclick(WebElement ele);
	public void aerodown(WebElement ele);
	public void clickEnter();
	public void closeNewTab(WebElement ele);
	public void loginfo(String mess);
	public void logerror(String mess);
	public void logwarn(String mess);
	public void logtrace(String mess);
	public void logFatal(String mess);
	public void logDebug(String mess);
	public void jsclick(WebElement ele);
}
