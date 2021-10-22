package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginData {
	WebDriver drive;
	public LoginData(WebDriver drive)
	{
		this.drive=drive;
		PageFactory.initElements(drive, this);
	}
	@FindBy(xpath="//input[@name='email']")
	WebElement email;
    public WebElement eMail()
    {
    	return email;
    }
    @FindBy(xpath="//input[@name='password']")
    WebElement pwd;
    public WebElement password()
    {
    	return pwd;
    }
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement login;
	public WebElement login_perform()
	{
		return login;
	}

}
