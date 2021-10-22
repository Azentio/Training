package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginCheck {
    WebDriver drive;    
	public LoginCheck(WebDriver drive)
        {
		this.drive=drive;
		PageFactory.initElements(drive, this);        	
        }
	@FindBy(linkText="Edit your account information")
	WebElement check;
	public WebElement checkStatus()
	{
		return check;
	}
	
}
