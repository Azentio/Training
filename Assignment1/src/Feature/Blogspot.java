package Feature;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Blogspot {
	WebDriver drive;
	WebDriverWait wait;
	@Given("^Navigate to the given website$")
	public void Navigate_to_the_given_website()
	{
		WebDriverManager.chromedriver().setup();
		drive=new ChromeDriver();	
	    drive.manage().window().maximize();
	    drive.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html");	
	
	}
	
	@And("^enter username and Hidden data in text box$")
	public void enter_username_and_Hidden_data_in_text_box()
	{
		wait=new WebDriverWait(drive,30);
		drive.findElement(By.id("text1")).sendKeys("Anandh");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("text3")));
		drive.findElement(By.id("text3")).sendKeys("Anandh");
		
		
	}
	
	
	 @And("^check i have boat check box$")
	    public void check_i_have_boat_check_box() {
	    drive.findElement(By.id("check3")).click();
	    }
	
	 
	 @And("^select female radio button$")
	 public void select_female_radio_button()

	 {
		 drive.findElement(By.id("radio2")).click();
	 }
	 
	 @And("^Choose Audi from dropdown$")
	 public void Choose_Audi_from_dropdown()
	 {
		 WebElement car=drive.findElement(By.id("Carlist"));
		 Select dropdown=new Select(car);
		 dropdown.selectByVisibleText("Audi");
	 }
	 
	 @And("^click show me alert button$")
	 public void click_show_me_alert_button()
	 {
		 drive.findElement(By.xpath("//input[@value='Show Me Alert']")).click();
	 }
	 
	 @When("^I click show me alert button and the alert tab is open$")
	 public void I_click_show_me_alert_button_and_the_alert_tab_is_open()
	 {
		 Alert alrt= drive.switchTo().alert();
		 alrt.accept();
		 
	 }
	 @And("^click open new page and handle the window$")
	 public void click_open_new_page_and_handle_the_window()
	 {
		 Set<String> win=drive.getWindowHandles();
		 Iterator<String> itr=win.iterator();
		 
			 String wid=itr.next();
			 drive.switchTo().window(wid);
		 drive.findElement(By.linkText("Open New Page")).click();
		 drive.close();
		 drive.quit();
	 }
	 
}
