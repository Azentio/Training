package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDown_KeyUp {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka.pradhan\\git\\repository\\Priyanka_Training\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//main window
		driver.get("http://omayo.blogspot.com");
		driver.manage().window().maximize();
		
WebElement compendiumdevLink = driver.findElement(By.linkText("compendiumdev"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(compendiumdevLink).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();

	}

}
