package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {

	public static void main(String[] args) throws InterruptedException
{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka.pradhan\\git\\repository\\Priyanka_Training\\Drivers\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		Thread.sleep(3000);
		
		WebElement dropdownfield = driver.findElement(By.id("drop1"));
		//Select class is the predefined class in Selenium WebDriver 
		Select select = new Select(dropdownfield);
		//select c predefined methods for performing various operations on Drop-down and Multi-selection box fields
		select.selectByVisibleText("doc 1");
		

	}

}
