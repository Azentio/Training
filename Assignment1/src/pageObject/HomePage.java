package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver drive;
	public HomePage(WebDriver drive)
	{
	this.drive=drive;	
    PageFactory.initElements(drive, this);
	}
   
@FindBy(linkText="My Account")
   WebElement myaccount;
   public WebElement myAccount()
   {
	   return myaccount;
   }
   @FindBy(linkText="Login")
   WebElement login;
   public WebElement login()
   {
	   return login;
   }
}
