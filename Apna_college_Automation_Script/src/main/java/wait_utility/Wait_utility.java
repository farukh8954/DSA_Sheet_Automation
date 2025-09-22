package wait_utility;

import org.openqa.selenium.WebElement;

public interface Wait_utility
{
	public void waitforclick(WebElement ele);
	public void waitforvisiblity(WebElement ele);
	public void waitforSendkeys(WebElement ele, String Data);
	public void alertispresent();
}
