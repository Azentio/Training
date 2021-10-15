package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeys {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka.pradhan\\git\\repository\\Priyanka_Training\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//main window
		driver.get("http://omayo.blogspot.com");
		driver.manage().window().maximize();
		

		WebElement username = driver.findElement(By.name("userid"));
		WebElement password = driver.findElement(By.name("pswrd"));
		
		Actions a = new Actions(driver);
		
		username.sendKeys("priya");
		a.sendKeys(Keys.TAB).perform();
		
		password.sendKeys("pradhan");
		// action send key for pressing. at the same time hold and release 
	//action key down and up two key are used to click hold and click release.
		a.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
	}

}
