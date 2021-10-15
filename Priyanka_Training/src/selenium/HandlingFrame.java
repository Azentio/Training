package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrame {
	
		public static void main(String[] args) 
		{
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka.pradhan\\git\\repository\\Priyanka_Training\\Drivers\\chromedriver.exe" );
					
					WebDriver driver = new ChromeDriver();
					driver.get("https://omayo.blogspot.com/");
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
					System.out.println(driver.findElements(By.tagName("iframe")).size());
					//find the frame 
					WebElement frame2 = driver.findElement(By.id("iframe2"));
					//Swtich to main window  to frame 
					driver.switchTo().frame(frame2);
					driver.findElement(By.id("q")).sendKeys("Arun Motoori");
					
					//Switch back to the main page using switchTo().defaultContent()
					driver.switchTo().defaultContent();
					
					driver.findElement(By.id("ta1")).sendKeys("Arun Motoori");
					//Finding the number of frames available on the page
					
					
					
					
	}

}
