package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingLightBox 
{

	public static void main(String[] args) throws InterruptedException 
	{

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka.pradhan\\git\\repository\\Priyanka_Training\\Drivers\\chromedriver.exe" );
			
			WebDriver driver = new ChromeDriver();
			driver.get("http://omayo.blogspot.in/p/lightbox.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			//Unlike alerts, frames or windows, we need not switch to Lightbox for performing operations.
			driver.findElement(By.id("lightbox1")).click();
			
			Thread.sleep(3000);
			//closing the light box
			driver.findElement(By.cssSelector(".close.cursor")).click();
			

	}

}
