package Base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BrowserSetup.LaunchingBrowser;
import pageObject.HomePage;
import pageObject.LoginCheck;
import pageObject.LoginData;

public class TestDemo1 extends LaunchingBrowser {
	WebDriver drive;
	@Test(dataProvider="setData")
   public void login(String email,String pwd,String expectedResult) throws IOException
   {   String actualResult;
	   drive=setBrowser();
	   drive.get(p.getProperty("URL"));
	   HomePage hp=new HomePage(drive);
	   LoginData data=new LoginData(drive);
	   hp.myAccount().click();
	   hp.login().click();
	   LoginCheck lc=new LoginCheck(drive);
	   data.eMail().sendKeys(email);
	   data.password().sendKeys(pwd);
	   data.login_perform().click();
	   try {
	   Assert.assertTrue(lc.checkStatus().isDisplayed());
	   actualResult="Pass";
	   }
	   catch(Exception e)
	   {
		   actualResult="Failure";
		   
	   }
	   Assert.assertEquals(actualResult, expectedResult);
   }
	@DataProvider()
	public Object[][] setData()
	{
		Object[][] data= {{"anandh1234@gmail.com","12345","Pass"},{"anandh123@gmail.com","265779","Failure"}};
		return data;
	}
   @AfterMethod()
   public void clouser()
   {
	drive.close();   
   }
   
}
