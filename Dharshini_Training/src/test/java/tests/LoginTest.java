package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.LandingPage;
import pageobjects.LoginPage;
import resources.BaseClass;

public class LoginTest extends BaseClass {
WebDriver driver;



	@Test(dataProvider="getlogindata")
	public void login(String email,String password,String expectedstatus) throws IOException,InterruptedException  {
		   driver= initializeDriver();
		 driver.get(prop.getProperty("url"));
		 
		 
		 LandingPage landingPage= new LandingPage(driver);
		 landingPage.myAccountDropdown().click();
		 landingPage.loginOption().click();		 
		
		 
		 LoginPage loginPage= new LoginPage(driver);
		 loginPage.emailAddressField().sendKeys(email);
		 loginPage.passwordField().sendKeys(password);
		 loginPage.loginButton().click();
		 Thread.sleep(5000);
		 //Assert.assertTrue(loginPage.EditYourAccountInfo().isDisplayed());
		 System.out.println(loginPage.EditYourAccountInfo().isDisplayed());
	
}
	@AfterMethod
	public void closure() {
		driver.close();
	}


@DataProvider
public Object[][] getlogindata() {
	Object[][] data= {{"dharshiniselvaraj23@gmail.com","Selvaraj23!","successful"},{"dummy@gmail.com","ffhdfd","failure"}}; 
	return data;
	
}
}