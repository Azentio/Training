package selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitingMachanism {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka.pradhan\\git\\repository\\Priyanka_Training\\Drivers\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.findElement(By.className("dropbtn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
	    WebElement facebookElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Facebook")));
		 facebookElement.click();
		// driver.quit();
	}

}
