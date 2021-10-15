package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionC
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka.pradhan\\git\\repository\\Priyanka_Training\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//main window
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement blogmenu=driver.findElement(By.id("blogsmenu"));
		WebElement selenium143Option = driver.findElement(By.linkText("Selenium143"));
		
		Actions a= new Actions(driver);
		
		a.moveToElement(blogmenu).perform();
		
		a.moveToElement(selenium143Option).click(selenium143Option).build().perform();
		
		//a.click(selenium143Option).perform();
		
		
	}

	
}
